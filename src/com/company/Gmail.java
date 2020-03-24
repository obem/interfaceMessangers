package com.company;

import java.util.Scanner;

public class Gmail implements Imessenger {
    String[] messages = new String[20];
    int messageCounter = 0;

    @Override
    public String writeMessenge(String message) {
        return (message + " " + " sent by gmail");
    }

    @Override
    public void receiveMessage(String message) {

    }


    public void receiveMessage1(String message) {
        System.out.println("Received by Gmail");
        System.out.println("Message: " + message);
    }


    @Override
    public int getMessengerNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return getMessengerNumber() + " Gmail";
    }
}
