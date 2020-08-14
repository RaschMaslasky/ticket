package com.company.ticket.web.screens.lineticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineTicket;

@UiController("ticket_LineTicket.edit")
@UiDescriptor("line-ticket-edit.xml")
@EditedEntityContainer("lineTicketDc")
@LoadDataBeforeShow
public class LineTicketEdit extends StandardEditor<LineTicket> {
}