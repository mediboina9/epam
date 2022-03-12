package com.company;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String input= "Hi My name is siva";

        String[] array=input.split(" ");


        for(int i=0;i< array.length;i++){
            StringBuffer sr=new StringBuffer(array[i]);
           // System.out.print(sr.reverse()+" ");

        }
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print(n*(j-1)+i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //Count number of repeated words
        String sentance="Hi Krisha , How Are you . Hi Siva , I am fine";
        HashMap<String, Integer> hashMap=new HashMap<>();
        String[] arr1=sentance.split(" ");

        for(int i=0;i< arr1.length;i++){
             if(hashMap.containsKey(arr1[i])==false){
                hashMap.put(arr1[i],1);
            }
           else if(hashMap.containsKey(arr1[i])==true ){
              //  int count=hashMap.get(arr1[i])+1;
                hashMap.put(arr1[i],hashMap.get(arr1[i])+1);
            }

        }
       /* for(int i=0;i< arr1.length;i++){
          //  System.out.println(arr1[i]+" value");

             System.out.println(hashMap.get(i)+"hashMap value");
        }*/
       // for(Integer i:hashMap.values()) System.out.println(i + "hashMap value");
       String key= hashMap.entrySet().stream().max((e1,e2)->e1.getValue() > e2.getValue()?1:1). get().getKey();
       System.out.print("Higest repeated key is:");
       System.out.println(key+" and Count is:"+hashMap.get(key));

        String hasCode1="abc";
        String hasCode2=new String("abc");
        String hasCode3="abc";
        System.out.println(hasCode1.hashCode()==hasCode3.hashCode());
        System.out.println(hasCode1.hashCode()==hasCode2.hashCode());

        //String appending without useing buffer/bullder
        String si="";
      for(int i=0;i< arr1.length;i++){
          si+=arr1[i];


        }
      System.out.println(si);




    }
}
