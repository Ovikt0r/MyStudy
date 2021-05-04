package com.company.oviktor.homework;

import java.util.Scanner;

public class DaysOfWeek {
    static int item;
    static char ch;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        calculateDay();
    }

    static void calculateDay() {

        try {
            System.out.println("Enter the number of the day :");
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
                System.out.println("Do you want to start again? Press Y/N");
                continueCalculate();
            } else {
                System.out.println("Enter the numbers from '1' till '7', please! ");
                calculateDay();
            }
        } catch (Exception e) {
            System.out.println("Enter the number in the range from 1 to 7, please!");
        }
    }

    static void continueCalculate() {
        ch = in.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            calculateDay();
        }
        if (ch == 'N' || ch == 'n') {
            System.out.println("Good bye");
        } else {
            System.out.println("Enter the right symbol !");
        }

    }
}

