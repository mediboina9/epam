package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>();
    al.add(1);al.add(2);al.add(3);al.add(4);
        Iterator<Integer> itr=al.iterator();
        while (itr.hasNext()){
            if(itr.next()==3){
                itr.remove();
            }
        }
        System.out.println(al);
        itr=al.iterator();
        while (itr.hasNext()){
            if(itr.next()==4){
                al.remove(2);
            }
        }
        System.out.println(al);



    }

}
