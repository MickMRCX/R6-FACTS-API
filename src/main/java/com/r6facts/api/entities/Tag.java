package com.r6facts.api.entities;

public class Tag {
    private final long id;
    private final String label;

    public Tag(long id, String label) {
        this.id = id;
        this.label = label;
    }

    public long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
