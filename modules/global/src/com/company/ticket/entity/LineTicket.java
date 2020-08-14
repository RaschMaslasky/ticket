package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|linePerson")
@Table(name = "TICKET_LINE_TICKET")
@Entity(name = "ticket_LineTicket")
public class LineTicket extends StandardEntity {
    private static final long serialVersionUID = -9168000150449757507L;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TICKET_ID")
    protected Ticket ticket;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    protected Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LINE_PERSON_ID")
    protected LinePerson linePerson;

    public LinePerson getLinePerson() {
        return linePerson;
    }

    public void setLinePerson(LinePerson linePerson) {
        this.linePerson = linePerson;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}