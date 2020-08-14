package com.company.ticket.web.screens.lineperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LinePerson;

@UiController("ticket_LinePerson.edit")
@UiDescriptor("line-person-edit.xml")
@EditedEntityContainer("linePersonDc")
@LoadDataBeforeShow
public class LinePersonEdit extends StandardEditor<LinePerson> {
}