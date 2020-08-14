package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "TICKET_LAW_ARTICLE")
@Entity(name = "ticket_LawArticle")
public class LawArticle extends StandardEntity {
    private static final long serialVersionUID = -6339286933741495645L;

    @Column(name = "NAME")
    protected String name;

    @Lob
    @Column(name = "ARTICLE")
    protected String article;

    @Lob
    @Column(name = "BODY_")
    protected String body;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}