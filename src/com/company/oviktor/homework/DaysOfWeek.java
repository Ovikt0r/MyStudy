package com.company.oviktor.homework;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        int item;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day number:");
        item = in.nextInt();

        if (item > 0 && item < 8) {

            switch (item) {

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

        }
        else {
            System.out.println("Enter the number in the range from 1 to 7, please!");
        }
    }
}
