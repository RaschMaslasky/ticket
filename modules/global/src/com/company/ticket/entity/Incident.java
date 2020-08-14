package com.company.ticket.entity;

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
@Table(name = "TICKET_INCIDENT")
@Entity(name = "ticket_Incident")
public class Incident extends StandardEntity {
    private static final long serialVersionUID = -29610404332198671L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "INCIDENT_DATE", nullable = false)
    protected Date incidentDate;

    @NotNull
    @Column(name = "INCIDENT_STATUS", nullable = false)
    protected String incidentStatus;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected String type;

    @Column(name = "INCIDENT_ID")
    protected String incidentId;

    @Lob
    @Column(name = "COMMENT")
    protected String comment;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "incident")
    protected List<LineAcitivity> activities;

    @OneToMany(mappedBy = "incident")
    protected List<LineCommonActivity> activitiesCommon;

    @OneToMany(mappedBy = "incident")
    protected List<LineDocs> docs;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "incident")
    protected List<LineStruckedPerson> struckedPersons;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "incident")
    protected List<LineCommissionPerson> commissionPersons;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "incident")
    protected List<LineInvolvedPerson> involvedPersons;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "incident")
    protected List<LineViolatorPerson> violaterPersons;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTIVITY_PATTERN_ID")
    protected ActivityPattern activityPattern;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_PLACE_ID")
    protected WorkPlace workPlace;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INITIATOR_ID")
    protected Person initiator;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INITIATOR_DATE")
    protected Date initiatorDate;

    @Column(name = "INVESTIGATION_START_DATE")
    protected String investigationStartDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INVESTIGATION_END_DATE")
    protected Date investigationEndDate;

    @Lob
    @Column(name = "CONDITIONS")
    protected String conditions;

    @Lob
    @Column(name = "DELAY_REASON")
    protected String delayReason;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VIEW_ID")
    protected IncidentView view;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OUTCOME_ID")
    protected IncidentOutcome outcome;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REASON_ID")
    protected IncidentReason reason;

    public List<LineDocs> getDocs() {
        return docs;
    }

    public void setDocs(List<LineDocs> docs) {
        this.docs = docs;
    }

    public void setActivitiesCommon(List<LineCommonActivity> activitiesCommon) {
        this.activitiesCommon = activitiesCommon;
    }

    public List<LineCommonActivity> getActivitiesCommon() {
        return activitiesCommon;
    }

    public List<LineInvolvedPerson> getInvolvedPersons() {
        return involvedPersons;
    }

    public void setInvolvedPersons(List<LineInvolvedPerson> involvedPersons) {
        this.involvedPersons = involvedPersons;
    }

    public Date getInvestigationEndDate() {
        return investigationEndDate;
    }

    public void setInvestigationEndDate(Date investigationEndDate) {
        this.investigationEndDate = investigationEndDate;
    }

    public String getInvestigationStartDate() {
        return investigationStartDate;
    }

    public void setInvestigationStartDate(String investigationStartDate) {
        this.investigationStartDate = investigationStartDate;
    }

    public Date getInitiatorDate() {
        return initiatorDate;
    }

    public void setInitiatorDate(Date initiatorDate) {
        this.initiatorDate = initiatorDate;
    }

    public void setOutcome(IncidentOutcome outcome) {
        this.outcome = outcome;
    }

    public IncidentOutcome getOutcome() {
        return outcome;
    }

    public void setReason(IncidentReason reason) {
        this.reason = reason;
    }

    public IncidentReason getReason() {
        return reason;
    }

    public void setView(IncidentView view) {
        this.view = view;
    }

    public IncidentView getView() {
        return view;
    }

    public String getDelayReason() {
        return delayReason;
    }

    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Person getInitiator() {
        return initiator;
    }

    public void setInitiator(Person initiator) {
        this.initiator = initiator;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }

    public List<LineViolatorPerson> getViolaterPersons() {
        return violaterPersons;
    }

    public void setViolaterPersons(List<LineViolatorPerson> violaterPersons) {
        this.violaterPersons = violaterPersons;
    }

    public List<LineCommissionPerson> getCommissionPersons() {
        return commissionPersons;
    }

    public void setCommissionPersons(List<LineCommissionPerson> commissionPersons) {
        this.commissionPersons = commissionPersons;
    }

    public List<LineStruckedPerson> getStruckedPersons() {
        return struckedPersons;
    }

    public void setStruckedPersons(List<LineStruckedPerson> struckedPersons) {
        this.struckedPersons = struckedPersons;
    }

    public void setActivityPattern(ActivityPattern activityPattern) {
        this.activityPattern = activityPattern;
    }

    public ActivityPattern getActivityPattern() {
        return activityPattern;
    }

    public List<LineAcitivity> getActivities() {
        return activities;
    }

    public void setActivities(List<LineAcitivity> activities) {
        this.activities = activities;
    }

    public void setType(IncidentType type) {
        this.type = type == null ? null : type.getId();
    }

    public IncidentType getType() {
        return type == null ? null : IncidentType.fromId(type);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DocStatus getIncidentStatus() {
        return incidentStatus == null ? null : DocStatus.fromId(incidentStatus);
    }

    public void setIncidentStatus(DocStatus incidentStatus) {
        this.incidentStatus = incidentStatus == null ? null : incidentStatus.getId();
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }
}