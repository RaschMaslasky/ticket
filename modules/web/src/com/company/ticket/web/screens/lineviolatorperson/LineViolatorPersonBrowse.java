package com.company.ticket.web.screens.lineviolatorperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineViolatorPerson;

@UiController("ticket_LineViolatorPerson.browse")
@UiDescriptor("line-violator-person-browse.xml")
@LookupComponent("lineViolatorPersonsTable")
@LoadDataBeforeShow
public class LineViolatorPersonBrowse extends StandardLookup<LineViolatorPerson> {
}