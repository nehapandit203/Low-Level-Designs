package com.example.demo.structural.decorator;

public class CheeseToppings implements Pizza {
    Pizza pizza;

    CheeseToppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getPrice() {
        return pizza.getPrice();
    }

    @Override
    public void getComposition() {
pizza.getComposition();
    }
}