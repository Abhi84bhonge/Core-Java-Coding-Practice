package com.constructor;
import java.util.Scanner;

public class Hello {
    
    String greeting_msg;
    String user_name;

    // Constructor to initialize greeting and username
    public Hello(String greeting_msg, String user_name) {
        this.greeting_msg = greeting_msg;
        this.user_name = user_name;
    }

    
    // Email method
    void emailsend() {
        String completemsg = greeting_msg + " " + user_name + " this is Email " + " SEND BY ABHIJEET BHONGE";
        System.out.println(completemsg);
    }

    // SMS method
    void smssend() {
        String completemsg1 = greeting_msg + " " + user_name + " this is Message " + " SEND BY ABHIJEET BHONGE";
        System.out.println(completemsg1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user details once
        System.out.print("Enter greeting message: ");
        String greeting = sc.nextLine();

        System.out.print("Enter your name: ");
        String uname = sc.nextLine();

        // Create object once
        Hello h = new Hello(greeting, uname);

        // Choice for email or sms
        System.out.print("Enter choice (email/sms): ");
        String usr_choice = sc.next();

        if (usr_choice.equalsIgnoreCase("email")) {
            h.emailsend();
        } else if (usr_choice.equalsIgnoreCase("sms")) {
            h.smssend();
        } else {
            System.out.println("You entered wrong input!");
        }

        sc.close();
    }
}

