package com.task_7_11_2025;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String coursename;

    Student() {}

    Student(String name, int age, String city, long phone, int id, String coursename) {
        super(name, age, city, phone);
        this.id = id;
        this.coursename = coursename;
    }

    @Override
    public void acceptData() {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter student ID: ");
        this.id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter course name: ");
        this.coursename = sc.nextLine();

        super.acceptData();
    }

    @Override
    public void showData() {
        System.out.println("ID: " + this.id);
        System.out.println("Course Name: " + this.coursename);
        super.showData();
    }

    public int getId() { return id; }
    public String getCoursename() { return coursename; }
}
