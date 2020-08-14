package com.company.ticket.web.screens.incidentreason;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentReason;

@UiController("ticket_IncidentReason.edit")
@UiDescriptor("incident-reason-edit.xml")
@EditedEntityContainer("incidentReasonDc")
@LoadDataBeforeShow
public class IncidentReasonEdit extends StandardEditor<IncidentReason> {
}