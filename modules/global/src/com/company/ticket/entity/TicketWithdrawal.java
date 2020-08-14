package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "TICKET_TICKET_WITHDRAWAL")
@Entity(name = "ticket_TicketWithdrawal")
public class TicketWithdrawal extends StandardEntity {
    private static final long serialVersionUID = 7549707714023420912L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "WITHDRAWAL_DATE", nullable = false)
    protected Date withdrawalDate;

    @NotNull
    @Column(name = "WITHDRAWAL_STATUS", nullable = false)
    protected String withdrawalStatus;

    @Column(name = "WITHDRAWAL_ID")
    protected String withdrawalId;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "ticketWithdrawal")
    protected List<LinePerson> persons;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELATIVE_DOC_ID")
    protected Incident relativeDoc;

    @Column(name = "COMMENT_")
    protected String comment;

    public void setRelativeDoc(Incident relativeDoc) {
        this.relativeDoc = relativeDoc;
    }

    public Incident getRelativeDoc() {
        return relativeDoc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<LinePerson> getPersons() {
        return persons;
    }

    public void setPersons(List<LinePerson> persons) {
        this.persons = persons;
    }

    public String getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    public DocStatus getWithdrawalStatus() {
        return withdrawalStatus == null ? null : DocStatus.fromId(withdrawalStatus);
    }

    public void setWithdrawalStatus(DocStatus withdrawalStatus) {
        this.withdrawalStatus = withdrawalStatus == null ? null : withdrawalStatus.getId();
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }
}