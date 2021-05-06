package com.company.oviktor.homework;

import java.text.DecimalFormat;
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
            while (!in.hasNextDouble()) {
                System.out.println("Enter the number in the right format !");
                System.out.println("r:");
                in.next();
            }
            r = in.nextDouble();
            System.out.println("Enter the height of the cone base radius:");
            System.out.println("h:");
            while (!in.hasNextDouble()) {
                System.out.println("Enter the number in the right format !");
                System.out.println("h:");
                in.next();
            }

            h = in.nextDouble();
            if (r > 0 && h > 0) {
                l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
                s = Math.PI * r * (r + l);
                DecimalFormat f = new DecimalFormat("##.00");
                System.out.println("Сone surface area is:");
                System.out.println("s = " + f.format(s));

                continueCalculate();

            } else {
                System.err.println("The value cannot be calculated! Enter positive number, please");
                continueCalculate();
            }

        } catch (
                Exception e) {
            String bad_input = in.next();
            System.out.println("You entered something wrong : " + bad_input);
        }
    }


    static void continueCalculate() {

        System.out.println("Do you want to calculate the square again ? Press Y/N");
        while (in.hasNextDouble()) {
            System.out.println("Enter the right alphabetical symbol !");
            in.next();
        }
        ch = in.next(".").charAt(0);

        if (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') {
            System.out.println("Enter the right alphabetical symbol !");
            in.next();
        } else if (ch == 'Y' || ch == 'y') {
            calculateSquare();
        } else {
            System.out.println("Thank you. Good bye!");
        }
    }


}
