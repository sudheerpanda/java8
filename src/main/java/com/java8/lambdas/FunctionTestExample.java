package com.java8.lambdas;

import java.util.function.Function;

public class FunctionTestExample {

    public static void main(String[] args) {

        Function<Integer,Integer> function=x->x*2;
        System.out.println("result-->"+function.apply(10));

        Function<Integer,Integer> function1=y-> y+2;
        System.out.println(function1.apply(20));

    }
}
