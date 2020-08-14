package com.company.ticket.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "TICKET_LINE_SHAPE_ACTIVITY")
@Entity(name = "ticket_LineShapeActivity")
public class LineShapeActivity extends StandardEntity {
    private static final long serialVersionUID = 5857338318248365758L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTIVITY_ID")
    protected Activity activity;

    @Column(name = "DURATION")
    protected BigDecimal duration;

    @Column(name = "SEQUENCE")
    protected Integer sequence;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTIVITY_PATTERN_ID")
    protected ActivityPattern activityPattern;

    public ActivityPattern getActivityPattern() {
        return activityPattern;
    }

    public void setActivityPattern(ActivityPattern activityPattern) {
        this.activityPattern = activityPattern;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}