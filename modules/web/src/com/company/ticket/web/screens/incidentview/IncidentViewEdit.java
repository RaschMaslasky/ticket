package com.company.ticket.web.screens.incidentview;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentView;

@UiController("ticket_IncidentView.edit")
@UiDescriptor("incident-view-edit.xml")
@EditedEntityContainer("incidentViewDc")
@LoadDataBeforeShow
public class IncidentViewEdit extends StandardEditor<IncidentView> {
}