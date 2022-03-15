package com.company;


import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

       int arr[]={1,5,3,8,5};
       int j,temp;
       for(int i=2;i<arr.length;i++) {
           j = i - 1;
           temp = arr[i];

           while (j >= 0 && arr[j] > temp) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = temp;
       }
        Arrays.stream(arr).forEach(System.out::println);


/*
oddList=list.stream().filter(e->e.getId()%2==0).collect(Collecotrs.toList);

HashMap<Integer, Integer> hashMap=new HashMap<>();
    if(int i=0;i<oddList.size();i++){
        if(hashMap.get(oddList.get(i))==null)
        {
            hashMap.put(oddList.get(i),1);
        }
        else if(hashMap.get(oddList.get(i))>0)
        {
            hashMap.put(oddList.get(i),hashMap.get(oddList.get(i))+1);
        }
        }

    hashMap.entrySet().stream().forEach(System.out::println);*/


    }
}
