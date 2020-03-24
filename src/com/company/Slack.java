package com.company;

import java.util.Scanner;

public class Slack implements Imessenger {
    @Override
    public String writeMessenge(String message) {
        return (message + " " + "send by Slack");

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
        return 3;
    }

    @Override
    public String toString() {
        return getMessengerNumber() + " Slack";
    }
}
