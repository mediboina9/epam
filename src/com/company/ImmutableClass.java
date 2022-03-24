package com.company;

public final class ImmutableClass {
   final private int id;
   final private String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
