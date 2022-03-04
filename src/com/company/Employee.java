package com.company;

public class Employee {
    private  int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static int getStaticMethod(){
        System.out.println("Static void method");
        return 5;
    }
    public void getNonStaticMethod(){
        System.out.println(getStaticMethod());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
