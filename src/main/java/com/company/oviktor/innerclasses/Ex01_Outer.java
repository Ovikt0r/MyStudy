package com.company.oviktor.innerclasses;

public class Ex01_Outer {


    public Inner returnInner() {
        return new Inner();
    }

    class Inner {
        void printName() {
            System.out.println("My name is Inner");
        }
    }


    public static void main(String[] args) {
        Ex01_Outer o = new Ex01_Outer();
        Ex01_Outer.Inner inner = o.returnInner();
        inner.printName();
    }
}
