package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@PublishEntityChangedEvents
@Table(name = "TICKET_ISSUE")
@Entity(name = "ticket_Issue")
public class Issue extends StandardEntity {
    private static final long serialVersionUID = 48184455519151675L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "ISSUE_DATE", nullable = false)
    protected Date issueDate;

    @NotNull
    @Column(name = "ISSUE_STATUS", nullable = false)
    protected String issueStatus;

    @Column(name = "ISSUE_ID")
    protected String issueId;

    @OneToMany(mappedBy = "issue")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    protected List<LinePerson> persons;

    @Lob
    @Column(name = "ISSUE_COMMENT")
    protected String issueComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELATIVE_DOCS_ID")
    protected Incident relativeDocs;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISSUE_PATTERN_ID")
    protected Pattern issuePattern;

    public Pattern getIssuePattern() {
        return issuePattern;
    }

    public void setIssuePattern(Pattern issuePattern) {
        this.issuePattern = issuePattern;
    }

    public void setRelativeDocs(Incident relativeDocs) {
        this.relativeDocs = relativeDocs;
    }

    public Incident getRelativeDocs() {
        return relativeDocs;
    }

    public String getIssueComment() {
        return issueComment;
    }

    public void setIssueComment(String issueComment) {
        this.issueComment = issueComment;
    }

    public void setPersons(List<LinePerson> persons) {
        this.persons = persons;
    }

    public List<LinePerson> getPersons() {
        return persons;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public DocStatus getIssueStatus() {
        return issueStatus == null ? null : DocStatus.fromId(issueStatus);
    }

    public void setIssueStatus(DocStatus issueStatus) {
        this.issueStatus = issueStatus == null ? null : issueStatus.getId();
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }
}