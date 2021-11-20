package com.company.oviktor.booktasks.innerclasses;


class Outer {

    class Inner {
        {
            System.out.println("Inner created");
        }
    }
}

public class Ex05 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
