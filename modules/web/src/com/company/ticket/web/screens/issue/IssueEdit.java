package com.company.ticket.web.screens.issue;

import com.company.ticket.entity.*;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@UiController("ticket_Issue.edit")
@UiDescriptor("issue-edit.xml")
@EditedEntityContainer("issueDc")
@LoadDataBeforeShow
public class IssueEdit extends StandardEditor<Issue> {

    @Inject
    private DateField<Date> dateField;

    @Inject
    private CollectionPropertyContainer<LineTicket> ticketsDc;

    @Inject
    private InstanceContainer<Issue> issueDc;

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Inject
    private PopupButton ticketGenerateMethod;

    private Calendar calendar = Calendar.getInstance();

    @Inject
    private Notifications notifications;

    @Inject
    private Dialogs dialogs;

    @Inject
    private MessageBundle messageBundle;

    @Inject
    private CollectionPropertyContainer<LinePerson> personsDc;

    @Inject
    private Button issueApproveButton;

    @Inject
    private Button issueCancelButton;

    @Inject
    private Table<LinePerson> personsTable;

    @Inject
    private Table<LineTicket> ticketsTable;



    @Subscribe("issueApproveButton")
    public void onIssueApproveButtonClick(Button.ClickEvent event) {

        // перед генерацией, получить подтверждение от Пользователя
        dialogs.createOptionDialog()
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withCaption(messageBundle.getMessage("info.Caption.IssueApprove"))
                .withMessage(messageBundle.getMessage("info.Context.IssueApprove"))
                .withActions(
                        new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(e -> doApproveIssue()),
                        new DialogAction(DialogAction.Type.CANCEL)
                )
                .show();
    }

    // обработка утверждения
    private void doApproveIssue() {
        // COMPLETED создание записи в регистре
        // COMPLETED изменение статусов Таллонов
        // COMPLETED изменение статуса документа
        // TODO refresh Screen

        CommitContext commitContext = new CommitContext();

        Issue issue = getEditedEntity();

        issue.setIssueStatus(DocStatus.APPROVED);

        for(LinePerson person: issue.getPersons()) {
            for(LineTicket ticket: person.getTickets()) {
                // TODO ищем то, что было до и делаем update, если не находим создаем новое
                // создаем записи в регистре
                LineTicketRegister newTicketRegister = metadata.create(LineTicketRegister.class);
                newTicketRegister.setDate(issue.getIssueDate());
                newTicketRegister.setPerson(person.getPerson());
                newTicketRegister.setIssue(issue);
                newTicketRegister.setQuantity(ticket.getQuantity());
                newTicketRegister.setTicket(ticket.getTicket());
                newTicketRegister.setPattern(issue.getIssuePattern());
                commitContext.addInstanceToCommit(newTicketRegister);
            }
        }

        notifications.create()
                .withCaption("Регистр обновлен")
                .withPosition(Notifications.Position.BOTTOM_RIGHT)
                .withType(Notifications.NotificationType.TRAY)
                .show();

        commitContext.addInstanceToCommit(issue);

        dataManager.commit(commitContext);

        getScreenData().loadAll();

    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {

        Issue issue = getEditedEntity();

        if (issue.getIssueStatus() == DocStatus.APPROVED) {
            issueApproveButton.setVisible(false);
            issueCancelButton.setVisible(true);
            personsTable.setEnabled(false);
            ticketsTable.setEnabled(false);
            dateField.setEnabled(false);
        } else {
            issueApproveButton.setVisible(true);
            issueCancelButton.setVisible(false);
            personsTable.setEnabled(true);
            ticketsTable.setEnabled(true);
            dateField.setEnabled(true);
        }
    }

    @Subscribe("ticketGenerateButton")
    public void onTicketGenerateButtonClick(Button.ClickEvent event) {
        //COMPLETED определить есть ли Сотрудники, если нет вывести Предупреждение, что нет сотрудников и генерации не будет
        //COMPLETED определить выбранный Шаблон, если Шаблона нет, то вывести ошибку, генерации - нет
        //COMPLETED сгенерировать в цикле, все людям, которые фигурируют в документы
        //COMPLETED изменить статус Таллона с DRAFT на RESERVED
        //TODO утвердить документ
        //TODO после утверждения, необходимо записать в Регистр, перевести статус в RESERVED в ISSUED
        //TODO отменить документ (возможно если после кандидата на отмену нет документов вправо по времени)
        //TODO Шаблон должен быть активным
        //TODO У Сотрудника не должны быть больше чем указано в Шаблоне Таллонов.
        //TODO Если у Сотрудника есть Таллоны (частно) дополнять разницу, предупреждеять.
        //TODO При выборе в ручном режиме Талона, необходимо показывать только те Таллоны, у которых статус DRAFT
        //TODO При связывании Талона с Сотрудником, статус талона должен меняться на RESERVED
        //TODO При выдаче Талона Сотруднику, статус талона должен меняться на ISSUED
        //TODO При изъятии Талона, статус талона должен меняться на WRITEOF
        //TODO При автоматическом связывании Талона с Сотрудником, необходимо проверять наличие "свободных" Таллонов, со статусом DRAFT

        Issue issue = getEditedEntity();

        // проверка на заполненность Шаблона и на то, что Шаблон удален
        if ((issue.getIssuePattern() == null) || (issue.getIssuePattern().isDeleted())) {
            notifications.create()
                    .withCaption("Шаблон не выбран")
                    .withPosition(Notifications.Position.BOTTOM_RIGHT)
                    .withType(Notifications.NotificationType.WARNING)
                    .show();
            return;
        }

        // перед генерацией, получить подтверждение от Пользователя
        dialogs.createOptionDialog()
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withCaption(messageBundle.getMessage("info.Caption.confirmation"))
                .withMessage(messageBundle.getMessage("info.Context.confirmation"))
                .withActions(
                        new DialogAction((DialogAction.Type.OK)),
                        new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(e-> {doCreateTickets(issue.getPersons(), issue.getIssuePattern());}),
                        new DialogAction(DialogAction.Type.CANCEL)
                )
                .show();
    }

    // Создание Таллонов на основании Списка Сотрудников, и Шаблона таллона
    //
    private void doCreateTickets(List<LinePerson> persons, Pattern pattern) {

        CommitContext commitContext = new CommitContext();

        for (LinePerson linePerson : persons) {
            List<LineTicket> lineTicket = doCreateLineTickets(linePerson, pattern);
            if (lineTicket.size() != 0) {
                linePerson.setTickets(lineTicket);
                commitContext.addInstanceToCommit(linePerson);
            }
        }
        dataManager.commit(commitContext);
        getScreenData().loadAll();
    }

    // Генерация таллонов
    // не создает, в случае если есть уже Таллоны
    private List<LineTicket> doCreateLineTickets(LinePerson linePerson, Pattern pattern) {

        List<LineTicket> currentTickets = linePerson.getTickets();

        if(currentTickets.size() == 0) {
            for(LineShape lineShape: pattern.getShapes()) {
                //создаем экземпляр Таллона, согласно шаблона
                Integer range = lineShape.getQuantity();

                if (range == null || range <= 0) {range = 1;};

                for(int i=0; i < range; i++){

                    // создаем Таллон
                    Ticket newTicket = metadata.create(Ticket.class);
                    newTicket.setStatus(TicketStatus.RESERVED); //статус
                    newTicket.setType(lineShape.getTicketType()); // тип
                    newTicket.setCode(Integer.toString(newTicket.getId().hashCode()));//кодissueApproveButton

                    // создаем линию Таллона
                    LineTicket newLineTicket = metadata.create(LineTicket.class);
                    newLineTicket.setQuantity(1);
                    newLineTicket.setLinePerson(linePerson);
                    newLineTicket.setTicket(newTicket);
                    currentTickets.add(newLineTicket);
                }
            }
            return currentTickets;
        }
        return currentTickets;
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Issue> event) {
        Issue issue = event.getEntity();
        // значение по умолчанию для Даты
        if (issue.getIssueDate() == null) {
            issue.setIssueDate(calendar.getTime());
        }

        // значение по умолчанию для Статуса
        if (issue.getIssueStatus() == null) {
            issue.setIssueStatus(DocStatus.DRAFT);
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {

        Issue issue = getEditedEntity();

        if (issue.getPersons() == null) {
            notifications.create()
                    .withCaption(messageBundle.getMessage("warning.Caption.minInfo"))
                    .withPosition(Notifications.Position.BOTTOM_RIGHT)
                    .withType(Notifications.NotificationType.WARNING)
                    .show();
            event.preventCommit();
        }
    }
}


