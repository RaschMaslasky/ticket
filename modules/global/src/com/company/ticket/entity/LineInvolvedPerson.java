package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TICKET_LINE_INVOLVED_PERSON")
@Entity(name = "ticket_LineInvolvedPerson")
public class LineInvolvedPerson extends StandardEntity {
    private static final long serialVersionUID = 8229480062404025541L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Column(name = "INVOLVED_STATUS")
    protected String involvedStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public void setInvolvedStatus(InvolvedStatus involvedStatus) {
        this.involvedStatus = involvedStatus == null ? null : involvedStatus.getId();
    }

    public InvolvedStatus getInvolvedStatus() {
        return involvedStatus == null ? null : InvolvedStatus.fromId(involvedStatus);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}