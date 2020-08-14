package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|person")
@Table(name = "TICKET_LINE_PERSON")
@Entity(name = "ticket_LinePerson")
public class LinePerson extends StandardEntity {
    private static final long serialVersionUID = 1149234825944800758L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "linePerson")
    protected List<LineTicket> tickets;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ISSUE_ID")
    protected Issue issue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKET_ISSUE_ID")
    protected TicketIssue ticketIssue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKET_WITHDRAWAL_ID")
    protected TicketWithdrawal ticketWithdrawal;

    public TicketWithdrawal getTicketWithdrawal() {
        return ticketWithdrawal;
    }

    public void setTicketWithdrawal(TicketWithdrawal ticketWithdrawal) {
        this.ticketWithdrawal = ticketWithdrawal;
    }

    public TicketIssue getTicketIssue() {
        return ticketIssue;
    }

    public void setTicketIssue(TicketIssue ticketIssue) {
        this.ticketIssue = ticketIssue;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public List<LineTicket> getTickets() {
        return tickets;
    }

    public void setTickets(List<LineTicket> tickets) {
        this.tickets = tickets;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}