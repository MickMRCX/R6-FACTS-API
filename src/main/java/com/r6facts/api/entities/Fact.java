package com.r6facts.api.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "facts")
public class Fact {

    @Id
    private long id;

    private String label;

    public Fact(){}

    public Fact(long id, String content) {
        this.id = id;
        this.label = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return label;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.label);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fact other = (Fact) obj;
        if (this.label != other.label) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Fact{id=").append(id).append(", label=").append(label).append("}");

        return builder.toString();
    }
}
