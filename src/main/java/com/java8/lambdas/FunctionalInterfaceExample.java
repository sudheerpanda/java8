package com.java8.lambdas;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void display();
    //void display2();this will have onle one non default method
     default  void log(){
         System.out.println("defaul log method inside "+FunctionalInterfaceExample.class);
     }

}
