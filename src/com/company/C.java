package com.company;

public class C extends B {
    public static void xyz(){
        B.xyz();
        System.out.println("C class xyz method here");
        B.xyz();
    }
}
