package com.example.demo.behavioural;

import org.apache.logging.log4j.message.Message;

import java.util.List;

public interface Observer {

    void addObserver(Listner observer);

    void removeObserver(Listner observer);

    void notifyObserver(String message);
}
