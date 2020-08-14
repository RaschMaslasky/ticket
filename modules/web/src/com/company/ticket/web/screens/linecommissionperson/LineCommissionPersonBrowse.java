package com.company.ticket.web.screens.linecommissionperson;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineCommissionPerson;

@UiController("ticket_LineCommissionPerson.browse")
@UiDescriptor("line-commission-person-browse.xml")
@LookupComponent("lineCommissionPersonsTable")
@LoadDataBeforeShow
public class LineCommissionPersonBrowse extends StandardLookup<LineCommissionPerson> {
}