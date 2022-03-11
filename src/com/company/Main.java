package com.company;
import java.lang.reflect.Array;
import  java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,-10,20};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==10){
                System.out.println("The pair of elements is: "+arr[i]+" "+arr[j]);
            }
        }
    }
    //Bullble sort
        int arr1[]={1,2,3,7,8,-10,20,4,5,6};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-i;j++){
                if(j<arr1.length-1&&arr1[j]>arr1[j+1]){
                    // System.out.println("The pair of elements is: "+arr[i]+" "+arr[j]);
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1   [i]+",");
        }




    }
}
