package com.course.practice;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();
        int future = age + years;
        System.out.println("In " + years + " years you will be " + future + "years old.");

    }
}
