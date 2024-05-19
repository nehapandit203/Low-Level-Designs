package com.example.demo.behavioural;

public class Client {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver();

        observer.addObserver(new EmailListner());
        observer.notifyObserver("Hello Me");
    }
}
