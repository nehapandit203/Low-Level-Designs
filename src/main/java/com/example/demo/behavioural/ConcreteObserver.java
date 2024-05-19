package com.example.demo.behavioural;

import org.apache.logging.log4j.message.Message;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver implements Observer{
    List<Listner> observerList;
   public ConcreteObserver(){
        this.observerList= new ArrayList<>();
    }
    @Override
    public void addObserver(Listner observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Listner observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        observerList.forEach(observer -> {
            observer.notifyObserver("Hello");
        });
    }
}
