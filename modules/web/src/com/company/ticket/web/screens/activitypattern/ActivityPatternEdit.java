package com.company.ticket.web.screens.activitypattern;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.ActivityPattern;

@UiController("ticket_ActivityPattern.edit")
@UiDescriptor("activity-pattern-edit.xml")
@EditedEntityContainer("activityPatternDc")
@LoadDataBeforeShow
public class ActivityPatternEdit extends StandardEditor<ActivityPattern> {
}