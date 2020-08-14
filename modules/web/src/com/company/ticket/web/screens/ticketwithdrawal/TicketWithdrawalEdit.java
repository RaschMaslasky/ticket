package com.company.ticket.web.screens.ticketwithdrawal;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.TicketWithdrawal;

@UiController("ticket_TicketWithdrawal.edit")
@UiDescriptor("ticket-withdrawal-edit.xml")
@EditedEntityContainer("ticketWithdrawalDc")
@LoadDataBeforeShow
public class TicketWithdrawalEdit extends StandardEditor<TicketWithdrawal> {
}