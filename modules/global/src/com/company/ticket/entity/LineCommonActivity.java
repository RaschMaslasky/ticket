package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "TICKET_LINE_COMMON_ACTIVITY")
@Entity(name = "ticket_LineCommonActivity")
public class LineCommonActivity extends StandardEntity {
    private static final long serialVersionUID = -129780491664139669L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACTIVITY_ID")
    protected Activity activity;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPORTER_ID")
    protected Person reporter;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_ID")
    protected Person responsible;

    @Column(name = "SEQUENCE")
    protected Integer sequence;

    @Column(name = "ACTIVITY_STATUS")
    protected String activityStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_FROM")
    protected Date dateFrom;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_TO")
    protected Date dateTo;

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public ActivityStatus getActivityStatus() {
        return activityStatus == null ? null : ActivityStatus.fromId(activityStatus);
    }

    public void setActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.getId();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Person getReporter() {
        return reporter;
    }

    public void setReporter(Person reporter) {
        this.reporter = reporter;
    }

    public void setResponsible(Person responsible) {
        this.responsible = responsible;
    }

    public Person getResponsible() {
        return responsible;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }
}