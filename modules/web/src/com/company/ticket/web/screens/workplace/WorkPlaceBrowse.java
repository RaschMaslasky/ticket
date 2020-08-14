package com.company.ticket.web.screens.workplace;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.WorkPlace;

@UiController("ticket_WorkPlace.browse")
@UiDescriptor("work-place-browse.xml")
@LookupComponent("workPlacesTable")
@LoadDataBeforeShow
public class WorkPlaceBrowse extends StandardLookup<WorkPlace> {
}