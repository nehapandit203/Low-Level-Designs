package com.example.demo.creational.builder;

public class Employee {
    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    private Employee(EmployeeBuilder emp) {
        this.name = emp.name;;
        this.company=emp.company;
        this.hasCar=emp.hasCar;
        this.hasBike=emp.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }


    }
}
