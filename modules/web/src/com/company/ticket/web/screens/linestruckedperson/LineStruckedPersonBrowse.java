package com.company.ticket.web.screens.linestruckedperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineStruckedPerson;

@UiController("ticket_LineStruckedPerson.browse")
@UiDescriptor("line-strucked-person-browse.xml")
@LookupComponent("lineStruckedPersonsTable")
@LoadDataBeforeShow
public class LineStruckedPersonBrowse extends StandardLookup<LineStruckedPerson> {
}