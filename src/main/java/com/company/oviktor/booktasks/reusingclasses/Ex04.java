package com.company.oviktor.booktasks.reusingclasses;

class Base {
    Base() {
        System.out.println("Base class constructor always initializes first");
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("Derived1 class constructor initializes second ");
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("Derived2 class constructor initializes third ");
    }
}


public class Ex04 {
    public static void main(String[] args) {
        new Derived2();
    }
}
