package com.company;


import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

       System.out.println("Hello Martina");
        FileReader file =new FileReader("C:\\Users\\Sony\\Downloads\\testing.txt");
        BufferedReader fileInput=new BufferedReader(file);
      //  BufferedWriter fileOutput = new BufferedWriter(file);
      //  fileOutput.write("Siva write here");
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<10;i++){
            //System.out.println(fileInput.readLine());
            list.add(fileInput.readLine());

        }
        list.stream().distinct().forEach(System.out::println);
        C.xyz();

        int arr[]={1,2,3,4,5,6,7,7};
        ArrayList<Integer> list1=new ArrayList<>(){
            {
                add(1);add(2);add(3);add(2);add(4);add(2);
            }
        };

        Collections.sort(list1);
        System.out.println(list1.get(list1.size()-3));


    }
}
