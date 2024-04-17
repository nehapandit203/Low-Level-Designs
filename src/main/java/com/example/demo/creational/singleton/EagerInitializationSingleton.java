package com.example.demo.creational.singleton;

public class EagerInitializationSingleton {

     private static EagerInitializationSingleton singleObj= new EagerInitializationSingleton();

     private EagerInitializationSingleton(){
     }

     public static EagerInitializationSingleton getInstance(){

         if(singleObj != null){
             return  singleObj;
         }
         else
             return new EagerInitializationSingleton();


     }
}
