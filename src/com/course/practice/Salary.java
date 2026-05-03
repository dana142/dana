package com.course.practice;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Entre hourly rate: ");
        int rate = scanner.nextInt();
        System.out.println("Enter hours worked: ");
        int hours = scanner.nextInt();
        int salary =  rate * hours;
        System.out.println(name + "salary is: " + salary);
    }
}
