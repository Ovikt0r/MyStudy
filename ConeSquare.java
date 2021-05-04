package com.company.oviktor.homework;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConeSquare {

    static double r;
    static double h;
    static double l;
    static double s;
    static char ch;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hi! This program calculate whole surface area of the cone.");
        System.out.println("You should enter the radius 'r' and the height 'h' to within two decimal places");
        System.out.println("Enter the cone base radius: ");
        calculateSquare();

    }

    static void calculateSquare() {
        try {
            System.out.println("r:");
            r = in.nextDouble();
            System.out.println("Enter the height of the cone base radius:");
            System.out.println("h:");
            h = in.nextDouble();

            if (r > 0 && h > 0) {
                l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
                s = Math.PI * r * (r + l);
                DecimalFormat f = new DecimalFormat("##.00");
                System.out.println("Сone surface area is:");
                System.out.println("s = " + f.format(s));
                System.out.println("Do you want to calculate the square again ? Press Y/N");
                continueCalculate();
            } else {
                System.out.println("The value cannot be calculated! Enter positive number, please");
            }
        } catch (Exception e) {
            System.out.println("Enter the number in the right format ");
        }
    }

    static void continueCalculate() {
        
        ch = in.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
        calculateSquare();
        }
        if (ch == 'N' || ch == 'n') {
            System.out.println("Good bye");
        } else {
            System.out.println("Enter the right symbol !");
        }
    }
    
}
