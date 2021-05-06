package com.company.oviktor.booktasks.operators;


class Currency {

    double a;
}

public class Ex04AliasingInMethod {

    static void m (Currency b) {
        b.a = 96.4d;
    }

    public static void main(String[] args) {

        Currency c = new Currency();
        c.a = 25.34d;
        System.out.println("1: value c.a = " + c.a);
        m(c);
        System.out.println("2: value c.a = " + c.a);


    }
}
