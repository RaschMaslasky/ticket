package com.company.ticket.web.screens.lineticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineTicket;

@UiController("ticket_LineTicket.browse")
@UiDescriptor("line-ticket-browse.xml")
@LookupComponent("lineTicketsTable")
@LoadDataBeforeShow
public class LineTicketBrowse extends StandardLookup<LineTicket> {
}