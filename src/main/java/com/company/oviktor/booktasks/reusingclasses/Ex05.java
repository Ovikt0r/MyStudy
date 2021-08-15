package com.company.oviktor.booktasks.reusingclasses;

class A {
    A() {
        System.out.println("A class constructor");
    }
}

class B {
    B() {
        System.out.println("B class constructor");
    }
}

class C extends A {
    B b = new B();
}


public class Ex05 {
    public static void main(String[] args) {
        new C();
    }
}
