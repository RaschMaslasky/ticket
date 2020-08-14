package com.company.ticket.web.screens.lineshapeactivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineShapeActivity;

@UiController("ticket_LineShapeActivity.edit")
@UiDescriptor("line-shape-activity-edit.xml")
@EditedEntityContainer("lineShapeActivityDc")
@LoadDataBeforeShow
public class LineShapeActivityEdit extends StandardEditor<LineShapeActivity> {
}