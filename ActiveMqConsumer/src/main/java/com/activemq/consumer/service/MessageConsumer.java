package com.activemq.consumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "AJAYQUEUE")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}