package com.company.ticket.web.screens.ticketissue;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.TicketIssue;

@UiController("ticket_TicketIssue.edit")
@UiDescriptor("ticket-issue-edit.xml")
@EditedEntityContainer("ticketIssueDc")
@LoadDataBeforeShow
public class TicketIssueEdit extends StandardEditor<TicketIssue> {
}