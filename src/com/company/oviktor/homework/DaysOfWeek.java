package com.company.oviktor.homework;

import java.util.Scanner;

class DaysOfWeek {


    public static void main(String[] args) {
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
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                }
                continueCalculate();
            } else {
                System.out.println("Enter the number in the range from 1 to 7, please!");
                continueCalculate();
            }
        }
    }

    static void continueCalculate() {

        System.out.println("Do you want to calculate the square again ? Type 'Y' or 'N'");
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String input = in.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    calculateDay();
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
