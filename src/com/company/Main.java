package com.company;


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



    }
}
