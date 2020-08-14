package com.company.ticket.web.screens.linedocs;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineDocs;

@UiController("ticket_LineDocs.browse")
@UiDescriptor("line-docs-browse.xml")
@LookupComponent("lineDocsesTable")
@LoadDataBeforeShow
public class LineDocsBrowse extends StandardLookup<LineDocs> {
}