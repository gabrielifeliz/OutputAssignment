package com.company;

import java.util.Scanner;

public class SomethingAboutYou {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        int age;
        String height;
        double gpa;

        System.out.print("What is your first name? ");
        firstName = keyboard.next();

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("How tall are you? ");
        height = keyboard.next();

        System.out.print("What is your GPA? ");
        gpa = keyboard.nextDouble();

        /* To display the values of name,age, height and gpa to the console
           I added lines 29, 30, 31, and 32
        */
        System.out.println("Name: " + firstName); // Line 29
        System.out.println("Age: " + age); // Line 30
        System.out.println("Height: " + height); // Line 31
        System.out.println("GPA: " + gpa); // Line 32
    }
}