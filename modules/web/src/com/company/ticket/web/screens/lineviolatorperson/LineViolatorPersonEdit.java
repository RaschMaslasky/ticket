package com.company.ticket.web.screens.lineviolatorperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineViolatorPerson;

@UiController("ticket_LineViolatorPerson.edit")
@UiDescriptor("line-violator-person-edit.xml")
@EditedEntityContainer("lineViolatorPersonDc")
@LoadDataBeforeShow
public class LineViolatorPersonEdit extends StandardEditor<LineViolatorPerson> {
}