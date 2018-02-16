package com.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,6,3,4,5,6,7,8,9,0);
        Consumer consumer=new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        numbers.forEach(consumer);

        //using  lambdas
        Consumer consumerLambda=(t)-> System.out.println(t);
        numbers.forEach(consumerLambda);

        //without using Consumer interace
        numbers.forEach((t)-> System.out.println(t));


    }
}
