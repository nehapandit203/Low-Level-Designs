package com.example.demo.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {

    Map<NotebookType,NotebookModel> map ;
    public NotebookRegistry(){
        map = new HashMap<>();
    }

    public NotebookModel getPrototype(NotebookType type){
      return map.get(type);
    }

    public void add(NotebookType type, NotebookModel value){
        map.put(type,value);
    }

}
