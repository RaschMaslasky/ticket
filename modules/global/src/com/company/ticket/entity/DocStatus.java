package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DocStatus implements EnumClass<String> {

    DRAFT("DRAFT"),
    INPROGRESS("INPROGRESS"),
    APPROVED("APPROVED"),
    CANCELLED("CANCELLED"),
    CLOSED("CLOSED");

    private String id;

    DocStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DocStatus fromId(String id) {
        for (DocStatus at : DocStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}