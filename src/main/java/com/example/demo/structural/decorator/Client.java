package com.example.demo.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new CheeseToppings(new PizzaBase());
        System.out.println(pizza.getPrice());
    }
}
