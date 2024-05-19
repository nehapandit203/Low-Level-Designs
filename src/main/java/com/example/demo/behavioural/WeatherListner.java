package com.example.demo.behavioural;

public class WeatherListner implements Listner{

    @Override
    public void notifyObserver(String message) {
        System.out.println("Weather Listner");
    }
}
