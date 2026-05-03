package com.course.practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter name: ");
       String name = scanner.nextLine();
       System.out.println("Enret age");
       int age = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter city: ");
       String city = scanner.nextLine();
       System.out.println("Hello " + name + "!");
       System.out.println("You are " + age + "years old.");
       System.out.println("You live in " + city +".");

    }
}


