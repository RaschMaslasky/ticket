package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TicketType implements EnumClass<String> {

    RED("RED"),
    YELLOW("YELLOW"),
    GREEN("GREEN");

    private String id;

    TicketType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TicketType fromId(String id) {
        for (TicketType at : TicketType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}