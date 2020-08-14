package com.company.ticket.web.screens.incidentview;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.IncidentView;

@UiController("ticket_IncidentView.browse")
@UiDescriptor("incident-view-browse.xml")
@LookupComponent("incidentViewsTable")
@LoadDataBeforeShow
public class IncidentViewBrowse extends StandardLookup<IncidentView> {
}