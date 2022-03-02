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
	// write your code here
       // System.out.println("Siva");
        Employee obj1=new Employee(1,"siva");
        Employee obj2=new Employee(2,"satya");
        Employee obj3=new Employee(3,"satya");
        //Employee obj3=new Employee(3,"satya");
    ArrayList<Employee> list=new ArrayList<>()
    {
        {
           add(obj1);
           add(obj2);
           add(obj3);
            add(obj3);
        }
    };
    //list.stream().filter(i-> i.getName()=="satya").distinct().forEach(System.out::println);
    //list.stream().filter(i-> i.getName()=="satya"&&i.getId()==2).forEach(System.out::println);
    //list.forEach(System.out::println);
    //System.out.println("..............distinct.............");
    //list.stream().distinct().forEach(System.out::println);
        //collect1.forEach(System.out::println);


        System.out.println("..............Function method in lambda expression.............");
        Function<Integer,Integer> getfactorial= n->n*n;
        System.out.println(getfactorial.apply(8));

        System.out.println(".........String reverse by botch....");
        String val="Java World";
        String val1=new StringBuilder(val).reverse().toString();
        System.out.println(val);
        System.out.println("..............object remove from list.............");
        list.removeIf(i->i.getId()==3);
        list.forEach(System.out::println);

        System.out.println("..............String find out word with out using contains By  virtusa.............");
        String Test="Siva,Satya,Narayana";
        String[] listOfString= (Test.split(","));
        Arrays.stream(listOfString).filter(Predicate.isEqual("Satya")).forEach(System.out::println);

        /*int[] listOfIntegers={1,5,10,30,15,20};
        Arrays.stream(listOfIntegers).sorted().filter()*/
        System.out.println("..............factorial using java 8 by Hcl.............");
        int number = 5;
        int getfact=IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
        System.out.println(getfact);
        Map<Integer, String> collect1 = list.stream().filter(i -> i.getName() == "satya" && i.getId() == 2).collect(Collectors.toMap(Employee::getId, Employee::getName));





        System.out.println("..............Objects_sorting by cognizant.............");
        list.stream().sorted(Comparator.comparing(Employee::getId)).sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println(".................Altimetrick.................");
        Map<Integer,String> hashMapList=new HashMap<>();
        hashMapList=list.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

        hashMapList.values().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println(".................asending.................");
        hashMapList.values().stream().sorted().forEach(System.out::println);

    }
}
