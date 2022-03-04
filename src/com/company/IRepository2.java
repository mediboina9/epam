package com.company;

public interface IRepository2 {
    static String value="Static member";
    public static void display(){
        System.out.println("Static method"+value);
    }
    public default int defaultMethod(){
        return 10;
    }
    void nonstaticMethod();
}
