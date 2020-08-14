package com.company.ticket.web.screens.pattern;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Pattern;

@UiController("ticket_Pattern.edit")
@UiDescriptor("pattern-edit.xml")
@EditedEntityContainer("patternDc")
@LoadDataBeforeShow
public class PatternEdit extends StandardEditor<Pattern> {
}