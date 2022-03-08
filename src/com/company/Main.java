package com.company;


import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    static{
        int j=10;
        System.out.println("Hello"+10);
    }
    public void myMethod(){
        System.out.println("Cool");
    }
    public Main(){
        System.out.println("is a");
    }
    static {
        System.out.println("Wallmart");
    }
    public static void main(String[] args) throws IOException {
        Main obj=new Main();
        obj.myMethod();
       // System.out.println("1st question class hash code"+obj.hashCode());
        //2ndQuestion
        int[] arr={0,1,2,3,4,5,6};
        int x=10,i=0,y;
        try{
            x=x/0;
            i++;
            y=10;
            i++;
        }
        catch (ArithmeticException e){
            i++;
            System.out.println(i+"catch block");
        }
        finally {
            i++;
            System.out.println(i+"finally block");

        }
    System.out.println(arr[i]);
        //3rd Question
        hack_func2(44,4,4,1,485);
        hack_func2(new double[]{1,2,3});
        //4th Question
        SubClass subClass=new SubClass(90);
        System.out.println("4th Question"+subClass.number);
    }

    private static void hack_func2(double... doubles) {
    if(doubles.length==0){
        System.out.println("No Array");
    }
    double result=doubles[0];
    for(int i=1;i<doubles.length;i++)
        if(doubles[i]>result) result=doubles[i];
        System.out.println("highest Value"+result);

    }


}
