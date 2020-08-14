package com.company.ticket.web.screens.lineinvolvedperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineInvolvedPerson;

@UiController("ticket_LineInvolvedPerson.edit")
@UiDescriptor("line-involved-person-edit.xml")
@EditedEntityContainer("lineInvolvedPersonDc")
@LoadDataBeforeShow
public class LineInvolvedPersonEdit extends StandardEditor<LineInvolvedPerson> {
}