package com.example.demo.structural;

import com.example.demo.structural.adapter.JustPayAdapter;
import com.example.demo.structural.adapter.PaymentProviderInterface;
import com.example.demo.structural.adapter.Swiggy;

public class Client {
    public static void main(String[] args) {
        PaymentProviderInterface justPayAdapter = new JustPayAdapter();
        Swiggy swiggyOrder = new Swiggy(justPayAdapter);

        justPayAdapter.checkConnection();


    }
}
