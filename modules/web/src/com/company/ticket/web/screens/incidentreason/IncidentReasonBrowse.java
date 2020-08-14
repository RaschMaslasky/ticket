package com.company.ticket.web.screens.incidentreason;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentReason;

@UiController("ticket_IncidentReason.browse")
@UiDescriptor("incident-reason-browse.xml")
@LookupComponent("incidentReasonsTable")
@LoadDataBeforeShow
public class IncidentReasonBrowse extends StandardLookup<IncidentReason> {
}