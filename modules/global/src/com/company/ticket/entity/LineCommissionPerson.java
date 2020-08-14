package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TICKET_LINE_COMMISSION_PERSON")
@Entity(name = "ticket_LineCommissionPerson")
public class LineCommissionPerson extends StandardEntity {
    private static final long serialVersionUID = -1762851448644382530L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Column(name = "IS_CHAIRMAN")
    protected Boolean isChairman;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public Boolean getIsChairman() {
        return isChairman;
    }

    public void setIsChairman(Boolean isChairman) {
        this.isChairman = isChairman;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}