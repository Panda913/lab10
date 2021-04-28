package com.company;

import java.util.ArrayList;

import static com.company.Find.*;

public class Main {

    public static void main(String[] args) {
try {
    Task1 ();
    Task2();
} catch (Exception e){
    System.out.println("OOps.....");
}





    }

public static void Task1 (){

    MyInterface find33 = (a,b,c,d) -> Find33(a,b,c,d);
    MyInterface find34 = (a,b,c,d) -> Find34(a,b,c,d);
    MyInterface find35 = (a,b,c,d) -> Find35(a,b,c,d);

    Func.Func(find33,1,2,3,7);
    Func.Func(find34,1,2,3,7);
    Func.Func(find35,1,2,3,7);
}
    public static void Task2 (){

        Person t1 = new Person("Danielle Hoover", 34);
        Person t2 = new Person("David Monahan", 23);
        Person t3 = new Person("Agatha Kaspar", 27);
        Person t4 = new Person("Gavin Smith", 32);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);
        persons.add(t4);

        persons.forEach(
                person -> System.out.println(person)
        );
        System.out.println();
        persons.forEach(System.out::println);
    }

}


