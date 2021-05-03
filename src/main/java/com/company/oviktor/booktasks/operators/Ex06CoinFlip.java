package com.company.oviktor.booktasks.operators;

import java.util.Random;

public class Ex06CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean coin = rand.nextBoolean();
        if (coin == true) {
            System.out.println("coin shows : "+ coin + " Orel");
        }
        else { System.out.println("coin shows : "+ coin + " Reshka"); }
    }
}
