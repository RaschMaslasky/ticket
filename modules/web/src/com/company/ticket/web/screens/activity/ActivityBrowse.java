package com.company.ticket.web.screens.activity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Activity;

@UiController("ticket_Activity.browse")
@UiDescriptor("activity-browse.xml")
@LookupComponent("activitiesTable")
@LoadDataBeforeShow
public class ActivityBrowse extends StandardLookup<Activity> {
}