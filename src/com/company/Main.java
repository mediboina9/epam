package com.company;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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
                itr.remove();
            }
        }
        System.out.println(al);
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>(new Integer[]{1,2,3,4});
        Iterator<Integer> itrList=list.listIterator();

        while (itrList.hasNext()){
            Integer no=(Integer) itrList.next();
            System.out.println(no);
            //every time 14 will be added into list
            if(true){
                list.add(14);
            }
            //for particular location we need to condition in if loop
            if(no==4){
                list.add(15);
            }
        }
       itrList=list.listIterator();

        while (itrList.hasNext()){
            Integer no=(Integer) itrList.next();
            System.out.println(no);

        }
        //CuncurrentHashMap



    }

}
