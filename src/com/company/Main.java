package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    ImmutableClass obj=new ImmutableClass(1,"Siva");
        System.out.println(obj);

        obj=new ImmutableClass(2,"Siva");
        System.out.println(obj);

        String s1="siva";
        String s2="Satya";
        System.out.println(s1+" hashcode "+s1.hashCode());
        s1=s1+"satya";
        System.out.println(s1+" hashcode "+s1.hashCode());
        s1="siva";
        System.out.println(s1+" hascode "+s1.hashCode());

        System.out.println(s2+" hashcode "+s2.hashCode());
        String s3=s1+s2;
        System.out.println(s3+" hashcode "+s3.hashCode());
        int a=10;
        int b=20;
        System.out.println(1+2+a+b);

    }

}
