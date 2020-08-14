package com.company.ticket.web.screens.incident;

import com.company.ticket.entity.DocStatus;
import com.company.ticket.entity.IncidentType;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TabSheet;
import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Incident;

import javax.inject.Inject;
import java.util.Calendar;

@UiController("ticket_Incident.edit")
@UiDescriptor("incident-edit.xml")
@EditedEntityContainer("incidentDc")
@LoadDataBeforeShow
public class IncidentEdit extends StandardEditor<Incident> {

    private Calendar calendar = Calendar.getInstance();

    @Inject
    private TabSheet mainTabSheet;

    @Inject
    private DataManager dataManager;

    //TODO при выборе типа инцидента необходимо заполнять список Мероприятий к выполнению
    //TODO в случае, если Мероприятия были ранее и не начаты, удалять и заполнять вновь
    //TODO в случае, если Мероприятия были ранее и начаты - ничего не делать
    //TODO мероприятия могут быть добавлены, и удалены. Удалять можно только то, что добавленошаблона - мероприятия удалять нельзя
    //TODO мероприятия, которые начаты, завершены - не могут быть удалены
    @Subscribe
    public void onInitEntity(InitEntityEvent<Incident> event) {
        Incident incident = event.getEntity();
        CommitContext commitContext = new CommitContext();

        // значение по умолчанию для Даты
        if (incident.getIncidentDate() == null) {
            incident.setIncidentDate(calendar.getTime());
        }

        // значение по умолчанию для Статуса
        if (incident.getIncidentStatus() == null) {
            incident.setIncidentStatus(DocStatus.DRAFT);
        }

        // значение по умолчанию для Типа инцидента
        if (incident.getType() == null) {
            incident.setType(IncidentType.INCIDENT);
            setActivitiesList();
        }
    }

    @Subscribe("incidentTypeField")
    public void onIncidentTypeFieldValueChange(HasValue.ValueChangeEvent<IncidentType> event) {

        IncidentType incidentType = event.getValue();
        TabSheet.Tab struckedPersonsTab = mainTabSheet.getTab("struckedPersonsTab");
        TabSheet.Tab commissionPersonsTab = mainTabSheet.getTab("commissionPersonsTab");
        TabSheet.Tab involvedPersonsTab = mainTabSheet.getTab("involvedPersonsTab");

        if (incidentType != IncidentType.VIOLATION) {
            struckedPersonsTab.setVisible(true);
            commissionPersonsTab.setVisible(true);
            involvedPersonsTab.setVisible(true);
        } else {
            struckedPersonsTab.setVisible(false);
            commissionPersonsTab.setVisible(false);
            involvedPersonsTab.setVisible(false);
        }

    }

    // заполнение списка мероприятий
    private void setActivitiesList() {
    }

}