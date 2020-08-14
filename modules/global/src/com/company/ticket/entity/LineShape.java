package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TICKET_LINE_SHAPE")
@Entity(name = "ticket_LineShape")
public class LineShape extends StandardEntity {
    private static final long serialVersionUID = -8956346382509824185L;

    @NotNull
    @Column(name = "TICKET_TYPE", nullable = false)
    protected String ticketType;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    protected Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PATTERN_ID")
    protected Pattern pattern;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public TicketType getTicketType() {
        return ticketType == null ? null : TicketType.fromId(ticketType);
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.getId();
    }
}