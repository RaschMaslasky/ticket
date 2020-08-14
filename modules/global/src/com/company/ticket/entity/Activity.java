package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@PublishEntityChangedEvents
@NamePattern("%s|name")
@Table(name = "TICKET_ACTIVITY")
@Entity(name = "ticket_Activity")
public class Activity extends StandardEntity {
    private static final long serialVersionUID = -4102997390260001043L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "ACTIVITY_TYPE", nullable = false)
    protected String activityType;

    @Column(name = "IS_REPORTED")
    protected Boolean isReported;

    @Column(name = "IS_CONTROLLED")
    protected Boolean isControlled;

    public Boolean getIsControlled() {
        return isControlled;
    }

    public void setIsControlled(Boolean isControlled) {
        this.isControlled = isControlled;
    }

    public Boolean getIsReported() {
        return isReported;
    }

    public void setIsReported(Boolean isReported) {
        this.isReported = isReported;
    }

    public ActivityType getActivityType() {
        return activityType == null ? null : ActivityType.fromId(activityType);
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType == null ? null : activityType.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}