package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ActivityStatus implements EnumClass<String> {

    DRAFT("DRAFT"),
    READY("READY"),
    INPROGRESS("INPROGRESS"),
    CANCELLED("CANCELLED"),
    FINISHED("FINISHED");

    private String id;

    ActivityStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ActivityStatus fromId(String id) {
        for (ActivityStatus at : ActivityStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}