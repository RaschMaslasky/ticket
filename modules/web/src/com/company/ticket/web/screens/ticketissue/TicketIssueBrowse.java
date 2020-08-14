package com.company.ticket.web.screens.ticketissue;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.TicketIssue;

@UiController("ticket_TicketIssue.browse")
@UiDescriptor("ticket-issue-browse.xml")
@LookupComponent("ticketIssuesTable")
@LoadDataBeforeShow
public class TicketIssueBrowse extends StandardLookup<TicketIssue> {
}