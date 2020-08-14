package com.company.ticket.web.screens.ticketwithdrawal;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.TicketWithdrawal;

@UiController("ticket_TicketWithdrawal.browse")
@UiDescriptor("ticket-withdrawal-browse.xml")
@LookupComponent("ticketWithdrawalsTable")
@LoadDataBeforeShow
public class TicketWithdrawalBrowse extends StandardLookup<TicketWithdrawal> {
}