package com.example.demo.structural.adapter;

public class RazorPayAdapter implements PaymentProviderInterface {
    RazorPayAPI razorPayAPI = new RazorPayAPI();

    @Override
    public void makeLink() {

    }

    @Override
    public void makePayment() {

    }

    @Override
    public void checkConnection() {
        razorPayAPI.makeConnection();
    }
}
