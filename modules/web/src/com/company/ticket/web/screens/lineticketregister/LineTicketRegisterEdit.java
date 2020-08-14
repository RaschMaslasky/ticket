package com.company.ticket.web.screens.lineticketregister;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineTicketRegister;

@UiController("ticket_LineTicketRegister.edit")
@UiDescriptor("line-ticket-register-edit.xml")
@EditedEntityContainer("lineTicketRegisterDc")
@LoadDataBeforeShow
public class LineTicketRegisterEdit extends StandardEditor<LineTicketRegister> {
}