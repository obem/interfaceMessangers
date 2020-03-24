package com.company;

import java.util.Scanner;

public class Outlook implements Imessenger {
    @Override
    public String writeMessenge(String message) {
        return (message + " " + "send Outlook");


    }

    @Override
    public void receiveMessage(String message) {

    }


    public String ricevereMessenge() {
        String message = "";
        return message;

    }


    @Override
    public int getMessengerNumber() {
        return 1;
    }

    @Override
    public String toString() {
        return getMessengerNumber() + " Outlook";
    }
}
