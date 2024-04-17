package com.example.demo.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Employee employee = new  Employee.EmployeeBuilder().setName("Neha").build();
        System.out.println(employee.getName());
    }
}
