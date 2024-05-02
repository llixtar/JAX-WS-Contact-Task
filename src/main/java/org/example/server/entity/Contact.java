package org.example.server.entity;

public record Contact(Integer id, String name, String number) {

    @Override
    public String toString() {
        return "id - " + this.id() +
                ", " + this.name() +
                ", number: " + this.number() + "\n";
    }
}
