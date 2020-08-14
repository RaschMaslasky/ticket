package com.company.ticket.web.screens.incident;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Incident;

@UiController("ticket_Incident.browse")
@UiDescriptor("incident-browse.xml")
@LookupComponent("incidentsTable")
@LoadDataBeforeShow
public class IncidentBrowse extends StandardLookup<Incident> {
}