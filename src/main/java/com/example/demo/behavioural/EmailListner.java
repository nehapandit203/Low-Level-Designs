package com.example.demo.behavioural;

public class EmailListner implements Listner{

    @Override
    public void notifyObserver(String message) {
        System.out.println("Going to send email");
    }
}
