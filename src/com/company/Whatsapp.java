package com.company;

import java.util.Scanner;

public class Whatsapp implements Imessenger {
    @Override
    public String writeMessenge(String  message) {
        return ( message +" "+"send by whatsapp");

    }

    @Override
    public void receiveMessage(String message) {

    }





    public  String ricevereMessenge() {
        String message = "";
        return message;

    }


    @Override
    public int getMessengerNumber() {
        return 2;
    }

    @Override
    public String toString() {
        return getMessengerNumber() + " Whatsapp";
    }
}
