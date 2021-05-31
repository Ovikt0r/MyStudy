package com.company.oviktor.booktasks.contolingexecution;
import java.util.concurrent.ThreadLocalRandom;

public class Ex02TwentyFive {
    public static void main(String[] args) {
        for (int i=0;i<=25;i++){
         compareRandom();
        }
    }
    static void compareRandom() {

        int x = ThreadLocalRandom.current().nextInt(25,51);
        int y = ThreadLocalRandom.current().nextInt(25,51);

        System.out.println("Value x = " + x +" ," + " Value y = " + y);
        if (x < y) {
            System.out.println("Value x less than value y");
        }
        else if (x > y) {
            System.out.println("Value x more than value y");
        }
        else {
            System.out.println("Value x is value y");
        }
    }
}
