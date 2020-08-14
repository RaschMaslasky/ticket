package com.company.ticket.web.screens.incidentoutcome;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentOutcome;

@UiController("ticket_IncidentOutcome.edit")
@UiDescriptor("incident-outcome-edit.xml")
@EditedEntityContainer("incidentOutcomeDc")
@LoadDataBeforeShow
public class IncidentOutcomeEdit extends StandardEditor<IncidentOutcome> {
}