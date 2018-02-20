package com.java8.lambdas;

import java.util.*;

public class CompareTestLambda {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
        List<Integer> listOfIntegers =
                new ArrayList<>(Arrays.asList(intArray));
        Comparator<Integer> normalInts=Integer::compare;
        Comparator<Integer> reverseComp=normalInts.reversed();
        Collections.sort(listOfIntegers,reverseComp);

        listOfIntegers.stream().forEach(s-> System.out.print(s+"  "));

    }
}
