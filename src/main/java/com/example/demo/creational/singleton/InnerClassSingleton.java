package com.example.demo.creational.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class InnerClassHelper {
       private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return InnerClassHelper.INSTANCE;
    }
}
