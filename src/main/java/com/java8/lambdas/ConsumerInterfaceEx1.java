package com.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx1 {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<Person>();
        Person person=new Person();
        person.setAddress("add1");
        person.setAge(12);
        person.setName("sudheer");
        persons.add(person);

        Consumer<Person> consumer=new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("name--->"+person.getName());
            }
        };


        ConsumerInterfaceEx1 c1=new ConsumerInterfaceEx1();
        c1.printPersonDetails(persons,consumer);
        //using lambda
        c1.printPersonDetails(persons,(Person t)-> System.out.println(t.getName()));
    }
    private  void printPersonDetails(List<Person> persons,Consumer<Person> cunsumer){
        persons.forEach(t->cunsumer.accept(t));
    }
}
