package com.company.oviktor.booktasks.reusingclasses;

class Insect {
    private final int i = 36;
    protected int j;
    Insect() {
        System.out.println("i = " + i + " j = " + j);
        j = 2;
    }
    private static int x1 = printInt("Field Insect.x1 is initialized");

    static int printInt(String s) {
        System.out.println(s);
        return 10;
    }
}
class Beetle extends Insect {
    private int k = printInt("Field Beetle.k is initialized");
    Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInt("Field Beetle.x2 is initialized");

}

class LadyBug extends Beetle {
    private int h = printInt("Field LadyBug.h is initialized");
    LadyBug(){
        System.out.println("h = " + h);
        System.out.println("j = " + j);
    }

    private static int x3 = printInt("Field LadyBug.x3 is initialized");
}


public class Ex24 {
    public static void main(String[] args) {
        new LadyBug();
    }
}
