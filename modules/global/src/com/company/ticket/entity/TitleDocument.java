package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TICKET_TITLE_DOCS")
@Entity(name = "ticket_TitleDocs")
public class TitleDocument extends StandardEntity {
    private static final long serialVersionUID = 8362690180744625497L;
}