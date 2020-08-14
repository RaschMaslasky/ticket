package com.company.ticket.web.screens.lineacitivity;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineAcitivity;

@UiController("ticket_LineAcitivity.browse")
@UiDescriptor("line-acitivity-browse.xml")
@LookupComponent("lineAcitivitiesTable")
@LoadDataBeforeShow
public class LineAcitivityBrowse extends StandardLookup<LineAcitivity> {
}