package com.company.oviktor.homework;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DaysOfWeek {

    private final static Logger log = LoggerFactory.getLogger(DaysOfWeek.class);


    public static void main(String[] args) {
        log.info("It's a launch of the app");
        calculateDay();
    }

    static void calculateDay() {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of the day :");
            while (!in.hasNextInt()) {
                System.out.println("Enter the number in the range from 1 to 7, please!");
                in.next();
            }
            int item = in.nextInt();
            if (item > 0 && item < 8) {
                switch (item) {
                    case 1 -> log.info("Monday");
                    case 2 -> log.info("Tuesday");
                    case 3 -> log.info("Wednesday");
                    case 4 -> log.info("Thursday");
                    case 5 -> log.info("Friday");
                    case 6 -> log.info("Saturday");
                    case 7 -> log.info("Sunday");
                }
                continueCalculate();
            } else {
                System.out.println("Enter the number in the range from 1 to 7, please!");
                continueCalculate();
            }
        }
    }

    static void continueCalculate() {

        System.out.println("Do you want to calculate the square again ? Type 'Yes' or 'No'");
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String input = in.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    calculateDay();
                    break;
                } else if (input.equalsIgnoreCase("no")) {
                    System.out.println("Good bye");
                    break;
                } else {
                    System.out.println("Make the right choice !");
                    System.out.println("Type 'Yes' or 'No'");
                }
            }
        }
    }
}