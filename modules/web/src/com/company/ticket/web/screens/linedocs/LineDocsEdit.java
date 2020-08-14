package com.company.ticket.web.screens.linedocs;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LineDocs;

@UiController("ticket_LineDocs.edit")
@UiDescriptor("line-docs-edit.xml")
@EditedEntityContainer("lineDocsDc")
@LoadDataBeforeShow
public class LineDocsEdit extends StandardEditor<LineDocs> {
}