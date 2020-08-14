package com.company.ticket.web.screens.linecommonactivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineCommonActivity;

@UiController("ticket_LineCommonActivity.edit")
@UiDescriptor("line-common-activity-edit.xml")
@EditedEntityContainer("lineCommonActivityDc")
@LoadDataBeforeShow
public class LineCommonActivityEdit extends StandardEditor<LineCommonActivity> {
}