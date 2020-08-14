package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "TICKET_DAMAGE_DEGREE")
@Entity(name = "ticket_DamageDegree")
public class DamageDegree extends StandardEntity {
    private static final long serialVersionUID = 5586654672876755677L;

    @Lob
    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "GROUP_")
    protected String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}