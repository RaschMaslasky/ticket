package com.company.ticket.web.screens.linecommissionperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineCommissionPerson;

@UiController("ticket_LineCommissionPerson.edit")
@UiDescriptor("line-commission-person-edit.xml")
@EditedEntityContainer("lineCommissionPersonDc")
@LoadDataBeforeShow
public class LineCommissionPersonEdit extends StandardEditor<LineCommissionPerson> {
}