package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum InvolvedStatus implements EnumClass<String> {

    PARTICIPANTS("PARTICIPANTS"),
    WITNESSES("WITNESSES"),
    OUTERSIDE("OUTERSIDE");

    private String id;

    InvolvedStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static InvolvedStatus fromId(String id) {
        for (InvolvedStatus at : InvolvedStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}