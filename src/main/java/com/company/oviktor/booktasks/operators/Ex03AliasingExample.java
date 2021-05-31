package com.company.oviktor.booktasks.operators;


    class Boiler {

        float capacity;
}
    public class Ex03AliasingExample {

    public static void main(String[] args) {


        Boiler b1 = new Boiler();
        b1.capacity = 5.72f;
        Boiler b2 = new Boiler();
        b2.capacity = 86.45f;

        System.out.println("1: b1 = " + b1.capacity + " b2 = " + b2.capacity);
        b1 = b2;
        System.out.println("1: b1 = " + b1.capacity + " b2 = " + b2.capacity);
        b2.capacity = 93.56f;
        System.out.println("1: b1 = " + b1.capacity + " b2 = " + b2.capacity);
    }
}
