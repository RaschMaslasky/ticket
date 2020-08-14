package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "TICKET_TICKET_ISSUE")
@Entity(name = "ticket_TicketIssue")
public class TicketIssue extends StandardEntity {
    private static final long serialVersionUID = 2600749151028030273L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "ISSUE_DATE", nullable = false)
    protected Date issueDate;

    @NotNull
    @Column(name = "ISSUE_STATUS", nullable = false)
    protected String issueStatus;

    @Column(name = "ISSUE_ID")
    protected String issueId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSONS_ID")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    protected LinePerson persons;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELATIVE_DOC_ID")
    protected Incident relativeDoc;

    @Column(name = "COMMENT_")
    protected String comment;

    public void setPersons(LinePerson persons) {
        this.persons = persons;
    }

    public LinePerson getPersons() {
        return persons;
    }

    public void setRelativeDoc(Incident relativeDoc) {
        this.relativeDoc = relativeDoc;
    }

    public Incident getRelativeDoc() {
        return relativeDoc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public DocStatus getIssueStatus() {
        return issueStatus == null ? null : DocStatus.fromId(issueStatus);
    }

    public void setIssueStatus(DocStatus issueStatus) {
        this.issueStatus = issueStatus == null ? null : issueStatus.getId();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}