package com.company.oviktor.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConeSquare {

    public static void main(String[] args) {

        double r;
        double h;
        double l;
        double s;

        Scanner in = new Scanner(System.in);
        System.out.println("Hi! This program calculate whole surface area of the cone.");
        System.out.println("You should enter the radius 'r' and the height 'h' to within two decimal places");
        System.out.println("Enter the cone base radius: ");
        System.out.println("r:");
        r = in.nextDouble();
        System.out.println("Enter the height of the cone base radius:");
        System.out.println("h:");
        h = in.nextDouble();
        l = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));

        if(r > 0 && h > 0){
            s = Math.PI*r*(r+l);
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println("Сone surface area is:");
            System.out.println("s = " + f.format(s));


        }
        else {
            System.out.println("The value cannot be calculated! Enter positive number, please");
        }
        in.close();


    }
}
