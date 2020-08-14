package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DocType implements EnumClass<String> {

    DOC("DOC"),
    IMAGE("IMAGE");

    private String id;

    DocType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DocType fromId(String id) {
        for (DocType at : DocType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}