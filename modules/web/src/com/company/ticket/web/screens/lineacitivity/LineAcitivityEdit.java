package com.company.ticket.web.screens.lineacitivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineAcitivity;

@UiController("ticket_LineAcitivity.edit")
@UiDescriptor("line-acitivity-edit.xml")
@EditedEntityContainer("lineAcitivityDc")
@LoadDataBeforeShow
public class LineAcitivityEdit extends StandardEditor<LineAcitivity> {
}