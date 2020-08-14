package com.company.ticket.web.screens.activitypattern;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.ActivityPattern;

@UiController("ticket_ActivityPattern.browse")
@UiDescriptor("activity-pattern-browse.xml")
@LookupComponent("activityPatternsTable")
@LoadDataBeforeShow
public class ActivityPatternBrowse extends StandardLookup<ActivityPattern> {
}