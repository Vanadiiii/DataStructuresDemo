package me.imatveev.arrays.data.impl;

import me.imatveev.arrays.data.Data;

import java.util.UUID;

public class Person implements Data<UUID> {
    private final UUID id;
    private final String name;
    private String department;

    public Person(UUID id, String name, String department) {
        if (id == null) {
            throw new IllegalArgumentException("Id is null!");
        }

        if (name == null) {
            throw new IllegalArgumentException("name is null!");
        }

        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                "}";
    }
}
