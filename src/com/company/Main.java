package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> items=new ArrayList<>(){
            {
                add("fan");add("fan");add("bulb");add("buld");
            }
        };
        ArrayList<Integer> price=new ArrayList<>(){
            {
                add(1400);add(1400);add(100);add(80);
            }
        };
        ArrayList<Integer> quantity=new ArrayList<>(){
            {
                add(2);add(2);add(1);add(10);
            }
        };
        int duplicates=getDuplipactes(items,price,quantity);
        System.out.println(items.size()-duplicates);



    }
    public static int getDuplipactes(List<String> items, List<Integer> price, List<Integer> quantity){
        int duplicates=0;
        for(int i=0;i< items.size();i++){
            for(int j=i+1;j<items.size();j++){
                if(items.get(i).equals(items.get(j))){
                    //System.out.println("Hello equal items");
                    if(price.get(i).equals(price.get(j))){
                       // System.out.println("Hello equal price");
                        if(quantity.get(i).equals(quantity.get(j))){
                            //System.out.println("Hello equal items");

                            duplicates++;
                        }
                    }
                }
            }
        }
        return duplicates;
    }

}
