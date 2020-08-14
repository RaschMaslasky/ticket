package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s (%s)|code,type")
@Table(name = "TICKET_TICKET")
@Entity(name = "ticket_Ticket")
public class Ticket extends StandardEntity {
    private static final long serialVersionUID = 1383743011685764726L;
    //TODO необходимо сделать генерацию кода в момент создания экземпляра Талона override Init

    @NotNull
    @Column(name = "CODE", nullable = false)
    protected String code;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected String type;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected String status;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_FROM")
    protected Date dataFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TO")
    protected Date dataTo;

    public Date getDataTo() {
        return dataTo;
    }

    public void setDataTo(Date dataTo) {
        this.dataTo = dataTo;
    }

    public Date getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(Date dataFrom) {
        this.dataFrom = dataFrom;
    }

    public TicketStatus getStatus() {
        return status == null ? null : TicketStatus.fromId(status);
    }

    public void setStatus(TicketStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public TicketType getType() {
        return type == null ? null : TicketType.fromId(type);
    }

    public void setType(TicketType type) {
        this.type = type == null ? null : type.getId();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}