package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum IncidentType implements EnumClass<String> {

    VIOLATION("VIOLATION"),
    INCIDENT("INCIDENT"),
    CRASH("CRASH"),
    FIRE("FIRE");

    private String id;

    IncidentType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static IncidentType fromId(String id) {
        for (IncidentType at : IncidentType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}