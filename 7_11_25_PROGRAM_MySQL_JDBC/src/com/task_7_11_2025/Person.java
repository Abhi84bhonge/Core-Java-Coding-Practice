package com.task_7_11_2025;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String city;
    private long phone;

    Person() {}

    Person(String name, int age, String city, long phone) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
    }

    public void acceptData() {
        Scanner sc=new Scanner(System.in);
    	System.out.print("Enter name: ");
        this.name = sc.nextLine();

        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter city: ");
        this.city = sc.nextLine();

        System.out.print("Enter phone: ");
        this.phone = sc.nextLong();
        sc.nextLine(); // consume newline
    }

    public void showData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("City: " + this.city);
        System.out.println("Phone: " + this.phone);
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    public long getPhone() { return phone; }
    
}
