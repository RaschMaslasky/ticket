package com.company.ticket.web.screens.ticket;

import com.company.ticket.entity.TicketStatus;
import com.haulmont.cuba.core.global.UuidSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Ticket;

import javax.inject.Inject;

@UiController("ticket_Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
@LoadDataBeforeShow
public class TicketEdit extends StandardEditor<Ticket> {

    @Inject
    private Notifications notifications;

    @Inject
    private UuidSource uuidSource;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Ticket> event) {

        Ticket ticket = event.getEntity();

        if (ticket.getCode() == null) {

            notifications.create()
                    .withCaption("ID " + ticket.getId().hashCode())
                    .withPosition(Notifications.Position.BOTTOM_RIGHT)
                    .withType(Notifications.NotificationType.WARNING)
                    .show();

            ticket.setCode(Integer.toString(ticket.getId().hashCode()));
            ticket.setStatus(TicketStatus.DRAFT);
        }
    }
    //TODO Необходимо генерация QR кода, при создании экземпляра сущности Таллон, со статусом DRAFT
    //TODO При связывании таллона с Сотрудником, статус таллона необходимо менять на RESERVED и DRAFT
    //TODO При удалении таллона проверять есть ли ссылки на него? если есть , то не удалять.

}