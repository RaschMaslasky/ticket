package com.company.ticket.web.screens.lineperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LinePerson;

@UiController("ticket_LinePerson.browse")
@UiDescriptor("line-person-browse.xml")
@LookupComponent("linePersonsTable")
@LoadDataBeforeShow
public class LinePersonBrowse extends StandardLookup<LinePerson> {
}