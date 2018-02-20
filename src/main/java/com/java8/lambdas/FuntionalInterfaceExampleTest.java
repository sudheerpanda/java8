package com.java8.lambdas;

public class FuntionalInterfaceExampleTest implements  FunctionalInterfaceExample {
    @Override
    public void display() {
        System.out.println("From Test class");
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example=new FuntionalInterfaceExampleTest();
        example.log();
        example.display();
    }
}
