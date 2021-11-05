package com.company.oviktor.booktasks.reusingclasses;

class A {
    A(float j) {
        System.out.println("A class constructor and argument j " + j);
    }
}

class B {

    B(char k) {
        System.out.println("B class constructor and char " + k);
    }
}

class C extends A {
    B b;

    C(String s) {
        super(2.8F);
        new B('X');
        System.out.println("C class constructor");

    }

}


public class Ex07 {
    public static void main(String[] args) {
        new C("This string won't be printed");
    }
}
