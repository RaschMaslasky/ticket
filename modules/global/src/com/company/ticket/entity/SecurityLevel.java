package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SecurityLevel implements EnumClass<String> {

    ZEROLEVEL("ZEROLEVEL"),
    FIRSTLEVEL("FIRSTLEVEL"),
    SECONDLEVEL("SECONDLEVEL"),
    THIRDLEVEL("THIRDLEVEL");

    private String id;

    SecurityLevel(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SecurityLevel fromId(String id) {
        for (SecurityLevel at : SecurityLevel.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}