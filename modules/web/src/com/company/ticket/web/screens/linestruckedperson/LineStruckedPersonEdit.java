package com.company.ticket.web.screens.linestruckedperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineStruckedPerson;

@UiController("ticket_LineStruckedPerson.edit")
@UiDescriptor("line-strucked-person-edit.xml")
@EditedEntityContainer("lineStruckedPersonDc")
@LoadDataBeforeShow
public class LineStruckedPersonEdit extends StandardEditor<LineStruckedPerson> {
}