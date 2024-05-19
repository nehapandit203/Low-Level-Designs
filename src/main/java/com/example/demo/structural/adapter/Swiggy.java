package com.example.demo.structural.adapter;

public class Swiggy {
    PaymentProviderInterface paymentProviderInterface ;

    public Swiggy(PaymentProviderInterface paymentType){
        this.paymentProviderInterface=paymentType;
    }
}
