package com.example.demo.structural.adapter;

public class JustPayAdapter implements  PaymentProviderInterface{
    JustPayAPI justPayAPI = new JustPayAPI();
    @Override
    public void makeLink() {

    }

    @Override
    public void makePayment() {

    }

    @Override
    public void checkConnection() {
        justPayAPI.makeConnection();
    }
}
