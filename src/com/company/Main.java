package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"John","IT");
                Employee emp2 = new Employee(2,"Sam","IT");
                Employee emp3 = new Employee(3,"Mohan","QA");
                Employee emp4 = new Employee(4,"Vivek","Dev");
                ArrayList<Employee> list=new ArrayList<>();
                list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.stream().sorted(Comparator.comparing(Employee::getName))
                .sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);


    }
}
