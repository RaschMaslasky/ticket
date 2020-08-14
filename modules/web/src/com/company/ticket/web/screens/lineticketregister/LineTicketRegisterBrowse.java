package com.company.ticket.web.screens.lineticketregister;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineTicketRegister;

@UiController("ticket_LineTicketRegister.browse")
@UiDescriptor("line-ticket-register-browse.xml")
@LookupComponent("lineTicketRegistersTable")
@LoadDataBeforeShow
public class LineTicketRegisterBrowse extends StandardLookup<LineTicketRegister> {
}