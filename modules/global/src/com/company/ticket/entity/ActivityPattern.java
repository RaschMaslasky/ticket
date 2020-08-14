package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "TICKET_ACTIVITY_PATTERN")
@Entity(name = "ticket_ActivityPattern")
public class ActivityPattern extends StandardEntity {
    private static final long serialVersionUID = 5295313810803373423L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "INCIDENT_TYPE", nullable = false)
    protected String incidentType;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "activityPattern")
    protected List<LineShapeActivity> activities;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public List<LineShapeActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<LineShapeActivity> activities) {
        this.activities = activities;
    }

    public void setIncidentType(IncidentType incidentType) {
        this.incidentType = incidentType == null ? null : incidentType.getId();
    }

    public IncidentType getIncidentType() {
        return incidentType == null ? null : IncidentType.fromId(incidentType);
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