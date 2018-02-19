package com.java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This class shows how to use a predicate in lambda expression
 * @author sudheerp
 */
public class PredicateExampleTest {
    public static void main(String[] args) {
        Employee employ=new Employee();
        employ.setAge(25);
        employ.setFirstName("sudheer");
        employ.setGender("MALE");
        employ.setId(1);
        Employee employ1=new Employee();
        employ1.setAge(26);
        employ1.setFirstName("RAM");
        employ1.setGender("MALE");
        employ1.setId(2);
        Employee employ2=new Employee();
        employ2.setAge(22);
        employ2.setFirstName("sita");
        employ2.setGender("MALE");
        employ2.setId(3);
        Employee employ3=new Employee();
        employ3.setAge(29);
        employ3.setFirstName("sarat");
        employ3.setGender("MALE");
        employ3.setId(4);
        List<Employee> employees=new ArrayList<Employee>();
        employees.add(employ);
        employees.add(employ1);
        employees.add(employ2);
        employees.add(employ3);
        System.out.println(filterEmployees(employees,isAdultMale()));

    }

    public static List<Employee> filterEmployees(List<Employee> employees,Predicate<Employee> predicate){
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
    public static Predicate<Employee> isAdultMale(){
        return p->p.getAge()>22 && p.getGender().equalsIgnoreCase("MALE");
    }
}
