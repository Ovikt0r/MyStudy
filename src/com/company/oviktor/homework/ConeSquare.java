package com.company.oviktor.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConeSquare {


    public static void main(String[] args) {
        System.out.println("Hi! This program calculate whole surface area of the cone.");
        System.out.println("You should enter the radius 'r' and the height 'h' to within two decimal places");
        System.out.println("Enter the cone base radius: ");
        calculateSquare();
    }

    static void calculateSquare() {

        double radius;
        double height;
        double coneLong;
        double square;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("radius:");
            while (!in.hasNextDouble()) {
                System.out.println("Enter the number in the right format !");
                System.out.println("radius:");
                in.next();
            }
            radius = in.nextDouble();
            System.out.println("Enter the height of the cone base radius:");
            System.out.println("height:");
            while (!in.hasNextDouble()) {
                System.out.println("Enter the number in the right format !");
                System.out.println("height:");
                in.next();
            }
            height = in.nextDouble();
            if (radius > 0 && height > 0) {
                coneLong = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
                square = Math.PI * radius * (radius + coneLong);
                DecimalFormat f = new DecimalFormat("##.00");
                System.out.println("Сone surface area is:");
                System.out.println("s = " + f.format(square));
            } else {
                System.err.println("The value cannot be calculated! Enter positive number, please");
            }
            continueCalculate();
        }
    }

    static void continueCalculate() {

        System.out.println("Do you want to calculate the square again ? Type 'Y' or 'N'");
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String input = in.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    calculateSquare();
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("Good bye");
                    break;
                } else {
                    System.out.println("Enter the right alphabetical symbol !");
                    System.out.println("Type 'Y' or 'N'");
                }
            }
        }
    }
}