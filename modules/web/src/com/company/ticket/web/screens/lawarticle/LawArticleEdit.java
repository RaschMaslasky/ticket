package com.company.ticket.web.screens.lawarticle;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.LawArticle;

@UiController("ticket_LawArticle.edit")
@UiDescriptor("law-article-edit.xml")
@EditedEntityContainer("lawArticleDc")
@LoadDataBeforeShow
public class LawArticleEdit extends StandardEditor<LawArticle> {
}