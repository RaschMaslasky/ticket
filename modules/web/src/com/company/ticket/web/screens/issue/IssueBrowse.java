package com.company.ticket.web.screens.issue;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Issue;

@UiController("ticket_Issue.browse")
@UiDescriptor("issue-browse.xml")
@LookupComponent("issuesTable")
@LoadDataBeforeShow
public class IssueBrowse extends StandardLookup<Issue> {
}