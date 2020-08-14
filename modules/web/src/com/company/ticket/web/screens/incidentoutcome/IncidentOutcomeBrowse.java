package com.company.ticket.web.screens.incidentoutcome;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentOutcome;

@UiController("ticket_IncidentOutcome.browse")
@UiDescriptor("incident-outcome-browse.xml")
@LookupComponent("incidentOutcomesTable")
@LoadDataBeforeShow
public class IncidentOutcomeBrowse extends StandardLookup<IncidentOutcome> {
}