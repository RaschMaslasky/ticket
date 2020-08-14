package com.company.ticket.web.screens.activity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Activity;

@UiController("ticket_Activity.edit")
@UiDescriptor("activity-edit.xml")
@EditedEntityContainer("activityDc")
@LoadDataBeforeShow
public class ActivityEdit extends StandardEditor<Activity> {
}