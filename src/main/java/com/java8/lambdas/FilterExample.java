package com.java8.lambdas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("sudheer", 30, new BigDecimal(10000)),
                new Staff("panda", 27, new BigDecimal(20000)),
                new Staff("Test", 33, new BigDecimal(30000))
        );

        // convert inside the map() method directly.
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("sudheer".equals(temp.getName())) {
                obj.setExtra("this  is for sudheer only!");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);
    }
}
