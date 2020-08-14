package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "TICKET_LINE_DOCS")
@Entity(name = "ticket_LineDocs")
public class LineDocs extends StandardEntity {
    private static final long serialVersionUID = -1078063317117846176L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DOC_TYPE")
    protected String docType;

    @Column(name = "COMMENT_")
    protected String comment;

    @Lob
    @Column(name = "DOC_LINK")
    protected String docLink;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public void setDocType(DocType docType) {
        this.docType = docType == null ? null : docType.getId();
    }

    public DocType getDocType() {
        return docType == null ? null : DocType.fromId(docType);
    }

    public String getDocLink() {
        return docLink;
    }

    public void setDocLink(String docLink) {
        this.docLink = docLink;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}