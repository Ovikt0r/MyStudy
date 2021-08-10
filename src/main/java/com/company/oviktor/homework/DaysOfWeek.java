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
            log.info("Enter the number of the day :");
            while (!in.hasNextInt()) {
                log.info("Enter the number in the range from 1 to 7, please!");
                in.next();
            }
            int item = in.nextInt();
            if (item > 0 && item < 8) {
                switch (item) {
                    case 1 -> log.info(Days.MONDAY.toString());
                    case 2 -> log.info(Days.TUESDAY.toString());
                    case 3 -> log.info(Days.WEDNESDAY.toString());
                    case 4 -> log.info(Days.THURSDAY.toString());
                    case 5 -> log.info(Days.FRIDAY.toString());
                    case 6 -> log.info(Days.SATURDAY.toString());
                    case 7 -> log.info(Days.SUNDAY.toString());
                }
            } else {
                log.info("Enter the number in the range from 1 to 7, please!");
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
                    calculateDay();
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