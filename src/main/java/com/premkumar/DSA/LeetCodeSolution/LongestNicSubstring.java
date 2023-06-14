package com.premkumar.DSA.LeetCodeSolution;

import java.util.*;
import java.util.stream.Collectors;

public class LongestNicSubstring {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));
    }
    static public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: arr) set.add(c);
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i+1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s;
    }
}
class Employee
{
    String name;
    String gender;

    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
class M{
    public static void main(String[] args) {
       getAllEmployees();
    }
   static void  getAllEmployees(){
        List<Employee> employeeList=new ArrayList<>(Arrays.asList(
                new Employee("ss","FEMALE"),
                new Employee("","MALE"),
                new Employee("","FEMALE"),
                new Employee("","FEMALE"),
                new Employee("","FEMALE"),
                new Employee("","FEMALE"),
                new Employee("","MALE"),
                new Employee("","MALE"),
                new Employee("","FEMALE"),
                new Employee("","MALE")));
     Map<String, Long> l=   employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(l);

     }
}


