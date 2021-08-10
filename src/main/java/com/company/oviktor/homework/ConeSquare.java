package com.company.oviktor.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConeSquare {


    public static void main(String[] args) {
        log.info("Hi! This program calculate whole surface area of the cone.");
        log.info("You should enter the radius 'r' and the height 'h' to within two decimal places");
        log.info("Enter the cone base radius: ");
        calculateSquare();
    }

    static void calculateSquare() {

        double radius;
        double height;
        double coneLong;
        double square;

        try (Scanner in = new Scanner(System.in)) {
            log.info("radius:");
            while (!in.hasNextDouble()) {
                log.info("Enter the number in the right format !");
                log.info("radius:");
                in.next();
            }
            radius = in.nextDouble();
            log.info("Enter the height of the cone base radius:");
            log.info("height:");
            while (!in.hasNextDouble()) {
                log.info("Enter the number in the right format !");
                log.info("height:");
                in.next();
            }
            height = in.nextDouble();
            if (radius > 0 && height > 0) {
                coneLong = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
                square = Math.PI * radius * (radius + coneLong);
                DecimalFormat f = new DecimalFormat("##.00");
                log.info("Сone surface area is:");
                log.info("s = " + f.format(square));
            } else {
                System.err.println("The value cannot be calculated! Enter positive number, please");
            }
            continueCalculate();
        }
    }

    static void continueCalculate() {

        log.info("Do you want to calculate the square again ? Type 'Yes' or 'No'");
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String input = in.nextLine();
                if ((input.equalsIgnoreCase("yes")) || (input.equalsIgnoreCase("y"))) {
                    calculateSquare();
                    break;
                } else if ((input.equalsIgnoreCase("no")) || (input.equalsIgnoreCase("n"))) {
                    log.info("Good bye");
                    break;
                } else {
                    log.info("Make the right choice !");
                    log.info("Type 'Yes' or 'No'");
                }
            }
        }
    }
}