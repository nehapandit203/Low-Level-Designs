package com.example.demo.creational.singleton;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LazzyInitializedSingleton {

   private static LazzyInitializedSingleton singleton;

   public LazzyInitializedSingleton(){}
    public  static LazzyInitializedSingleton getInstance(){
        if(singleton == null){
            singleton = new LazzyInitializedSingleton();
        }
        return singleton;
    }
}
