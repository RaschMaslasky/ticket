package com.company.ticket.web.screens.lawarticle;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LawArticle;

@UiController("ticket_LawArticle.browse")
@UiDescriptor("law-article-browse.xml")
@LookupComponent("lawArticlesTable")
@LoadDataBeforeShow
public class LawArticleBrowse extends StandardLookup<LawArticle> {
}