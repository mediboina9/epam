package com.company;


import java.io.*;
import java.util.ArrayList;

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






    }
}
