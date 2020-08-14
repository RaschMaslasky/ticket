package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ActivityType implements EnumClass<String> {

    ACTIVITY("ACTIVITY"),
    ORDER("ORDER"),
    ASSIGNMENT("ASSIGNMENT"),
    PERSONALORDER("PERSONALORDER"),
    EXECUTIONCONTROL("EXECUTIONCONTROL"),
    NOTES("NOTES"),
    REBUKE("REBUKE"),
    CONTRACTTERMINATION("CONTRACTTERMINATION");

    private String id;

    ActivityType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ActivityType fromId(String id) {
        for (ActivityType at : ActivityType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}