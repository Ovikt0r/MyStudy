package com.company.oviktor.booktasks.reusingclasses;

public class Ex16_Main {

    public static void main(String[] args) {

        Amphibian amphibian = new Frog();
        amphibian.breath();
        amphibian.swimAway();
        amphibian.jump();
        Frog frog = new Frog();
        frog.squawk();

    }
}
