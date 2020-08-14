package com.company.ticket.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Ticket;

@UiController("ticket_Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
@LoadDataBeforeShow
public class TicketBrowse extends StandardLookup<Ticket> {
}