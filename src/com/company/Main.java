package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Imessenger[] messengers = new Imessenger[10];
        messengers[0] = new Gmail();
        messengers[1] = new Outlook();
        messengers[2] = new Whatsapp();
        messengers[3] = new Slack();



        for (Imessenger messenger : messengers) {
            if (messenger != null) {
                System.out.println(messenger);
            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie Ihren gewünschten Messenger ");
        String mySelectionString = scanner.nextLine();
        int mySelection = Integer.valueOf(mySelectionString);
        System.out.println("Geben sie eine Nachricht ein:");
        String message = scanner.nextLine();

        Imessenger messengerToUse = messengers[mySelection];
        String messageToSend = messengerToUse.writeMessenge(message);

        for (Imessenger messenger : messengers) {
            if (messenger != null) {
                messenger.receiveMessage(messageToSend);
            }
        }

        }


    }

