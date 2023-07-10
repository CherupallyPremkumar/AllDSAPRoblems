package com.premkumar.DSA.Interview;

import com.premkumar.DSA.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaEight {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            employeeList.add(new Employee(i, "Employee ", 5));
            employeeList.add(new Employee(i, "Employee ", 6));
        }
        m(employeeList);
    }

    public static void m(List<Employee> employeeList) {
        Map<Object, Set<Employee>> e = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toSet()));
        System.out.println(e);
        Set<Employee> s = new HashSet<>(employeeList);

    }
}
interface A
{
    default void M()
    {

    }
}
interface B
{
    default void M()
    {

    }
}
class L implements A,B
{

    @Override
    public void M() {
        A.super.M();
    }
}

