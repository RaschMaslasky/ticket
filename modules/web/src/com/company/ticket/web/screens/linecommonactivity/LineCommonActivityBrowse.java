package com.company.ticket.web.screens.linecommonactivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineCommonActivity;

@UiController("ticket_LineCommonActivity.browse")
@UiDescriptor("line-common-activity-browse.xml")
@LookupComponent("lineCommonActivitiesTable")
@LoadDataBeforeShow
public class LineCommonActivityBrowse extends StandardLookup<LineCommonActivity> {
}