package com.example.demo.creational.prototype;

import com.example.demo.creational.prototype.NotebookModel;
import com.example.demo.creational.prototype.NotebookRegistry;
import com.example.demo.creational.prototype.NotebookType;

public class ClientPrototype {
    public static void main(String[] args) {

        NotebookModel a4 = NotebookModel.builder().
                price(12)
                .fact("I am big")
                .breadth(4)
                .noOfPages(50)
                .build();

        NotebookModel a5 =NotebookModel.builder().
                price(12)
                .fact("I am too big")
                .breadth(10)
                .noOfPages(100)
                .build();

        NotebookModel diary = NotebookModel.builder().
                price(12)
                .fact("I am small")
                .breadth(50)
                .noOfPages(150)
                .build();

        NotebookRegistry notebookRegistry = new NotebookRegistry();
        notebookRegistry.add(NotebookType.A4,a4);
        notebookRegistry.add(NotebookType.A5,a5);
        notebookRegistry.add(NotebookType.DIARY,diary);


        for (int i = 0; i < 100; i++) {
            NotebookModel notebookModel = notebookRegistry.getPrototype(NotebookType.DIARY).clone();
            notebookModel.setBreadth(50);
        }
    }
}

// Prototype DP is used when:
// 1. Creation of an object is more difficult that copying of the fields
// 2. When we need multiple instances of same type with only a few changes

/*
      Create prototype objects
      Store in a registry(map)
      Get the prototype from map
      Create a clone(deepCopy) of the prototype
      Update the values, and use it
 */

// Create a prototype and registry design pattern solution for
// local trains in Mumbai
// All trains have same fare, same train type, same engine type, same number of seats
// but have different timings, and stations