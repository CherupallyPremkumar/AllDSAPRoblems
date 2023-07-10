package com.premkumar.DSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Date dateOfBirth;
    private int age;
    private double loan;

    public Employee(int id, String name,int age) {
        this.id = id;
        this.name = name;
      this.age=age;
    }

    // Getters and setters for the properties

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    // Example usage
    public static void main(String[] args) {
        // Create a new list of employees
        List<Employee> employeeList = new ArrayList<>();

        // Add more employees as needed...

        // Access elements in the list
        System.out.println(employeeList.stream().filter(a->a.getId()%2==0).mapToInt(Employee::getId).sum());
        employeeList.stream().map(a->a.getName()).reduce(String.valueOf(0),(a, b)->a +"-"+b).isBlank();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                ", loan=" + loan +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
