package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "TICKET_PATTERN")
@Entity(name = "ticket_Pattern")
public class Pattern extends StandardEntity {
    private static final long serialVersionUID = 3609448671072898532L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "IS_DEFAULT", nullable = false)
    protected Boolean isDefault = false;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "pattern")
    protected List<LineShape> shapes;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_FROM", nullable = false)
    protected Date dateFrom;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_TO", nullable = false)
    protected Date dateTo;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public List<LineShape> getShapes() {
        return shapes;
    }

    public void setShapes(List<LineShape> shapes) {
        this.shapes = shapes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}