package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TicketStatus implements EnumClass<String> {

    DRAFT("DRAFT"),
    RESERVED("RESERVED"),
    ISSUED("ISSUED"),
    WRITEOF("WRITEOF");

    private String id;

    TicketStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TicketStatus fromId(String id) {
        for (TicketStatus at : TicketStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}