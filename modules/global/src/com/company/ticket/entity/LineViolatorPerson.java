package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "TICKET_LINE_VIOLATOR_PERSON")
@Entity(name = "ticket_LineViolatorPerson")
public class LineViolatorPerson extends StandardEntity {
    private static final long serialVersionUID = 3229287241375176786L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_PLACE_ID")
    protected WorkPlace workPlace;

    @Column(name = "GULTY_DEGREE")
    protected Integer gultyDegree;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTIVITY_ID")
    protected Activity activity;

    @Column(name = "ACTIVITY_STATUS")
    protected String activityStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTIVITY_START_DATE")
    protected Date activityStartDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTIVITY_END_DATE")
    protected Date activityEndDate;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LAW_ARTICLE_ID")
    protected LawArticle lawArticle;

    public LawArticle getLawArticle() {
        return lawArticle;
    }

    public void setLawArticle(LawArticle lawArticle) {
        this.lawArticle = lawArticle;
    }

    public ActivityStatus getActivityStatus() {
        return activityStatus == null ? null : ActivityStatus.fromId(activityStatus);
    }

    public void setActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.getId();
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public Date getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(Date activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public Date getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Integer getGultyDegree() {
        return gultyDegree;
    }

    public void setGultyDegree(Integer gultyDegree) {
        this.gultyDegree = gultyDegree;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}