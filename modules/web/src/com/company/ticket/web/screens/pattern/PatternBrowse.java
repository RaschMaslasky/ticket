package com.company.ticket.web.screens.pattern;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Pattern;

@UiController("ticket_Pattern.browse")
@UiDescriptor("pattern-browse.xml")
@LookupComponent("patternsTable")
@LoadDataBeforeShow
public class PatternBrowse extends StandardLookup<Pattern> {
}