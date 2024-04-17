package com.example.demo.creational.singleton;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton(){}

    public DoubleCheckedLockingSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
