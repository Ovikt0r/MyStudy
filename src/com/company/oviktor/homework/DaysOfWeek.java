package com.company.oviktor.homework;

import java.util.Scanner;

class DaysOfWeek {
    static int item;
    static char ch;

    public static void main(String[] args) {
        calculateDay();
    }

    static void calculateDay() {

        try (Scanner in = new Scanner(System.in))  {
            System.out.println("Enter the number of the day :");
            while (!in.hasNextInt()) {
                System.out.println("Enter the number in the range from 1 to 7, please!");
                in.next();
            }
            item = in.nextInt();
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

        System.out.println("Do you want to calculate the square again ? Press Y/N");
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextDouble()) {
                System.out.println("Don't enter numbers !");
                in.next();
            }
            ch = in.next(".").charAt(0);

            if (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') {
                System.out.println("Enter the right alphabetical symbol !");
                in.next();
            } else if (ch == 'Y' || ch == 'y') {
                calculateDay();
            } else {
                System.out.println("Thank you. Good bye!");
            }
        }
    }
}
