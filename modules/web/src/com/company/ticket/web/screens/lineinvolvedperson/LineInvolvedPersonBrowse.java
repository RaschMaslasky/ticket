package com.company.ticket.web.screens.lineinvolvedperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineInvolvedPerson;

@UiController("ticket_LineInvolvedPerson.browse")
@UiDescriptor("line-involved-person-browse.xml")
@LookupComponent("lineInvolvedPersonsTable")
@LoadDataBeforeShow
public class LineInvolvedPersonBrowse extends StandardLookup<LineInvolvedPerson> {
}