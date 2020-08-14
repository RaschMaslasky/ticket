package com.company.ticket.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DamageType implements EnumClass<String> {

    EASY("EASY"),
    HEAVY("HEAVY"),
    LETHAL("LETHAL");

    private String id;

    DamageType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DamageType fromId(String id) {
        for (DamageType at : DamageType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}