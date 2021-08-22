package com.company.oviktor.booktasks.reusingclasses;

public class Ex16_Main {

    public static void main(String[] args) {

        Amphibian amphibian = new Frog();
        amphibian.jump(6);
        amphibian.goTo("Arabol", 5);
        amphibian.depth("ground of the lake", 45);
        Frog frog = new Frog();
        frog.goTo("Rishikesh", 5, 4.3);

    }
}
