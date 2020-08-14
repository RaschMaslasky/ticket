package com.company.ticket.web.screens.lineshapeactivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineShapeActivity;

@UiController("ticket_LineShapeActivity.browse")
@UiDescriptor("line-shape-activity-browse.xml")
@LookupComponent("lineShapeActivitiesTable")
@LoadDataBeforeShow
public class LineShapeActivityBrowse extends StandardLookup<LineShapeActivity> {
}