package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TICKET_LINE_STRUCKED_PERSON")
@Entity(name = "ticket_LineStruckedPerson")
public class LineStruckedPerson extends StandardEntity {
    private static final long serialVersionUID = -8407104597888122474L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Column(name = "DAMAGE")
    protected String damage;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAMAGE_DEGREE_ID")
    protected DamageDegree damageDegree;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_PLACE_ID")
    protected WorkPlace workPlace;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCIDENT_ID")
    protected Incident incident;

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDamage(DamageType damage) {
        this.damage = damage == null ? null : damage.getId();
    }

    public DamageType getDamage() {
        return damage == null ? null : DamageType.fromId(damage);
    }

    public void setDamageDegree(DamageDegree damageDegree) {
        this.damageDegree = damageDegree;
    }

    public DamageDegree getDamageDegree() {
        return damageDegree;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}