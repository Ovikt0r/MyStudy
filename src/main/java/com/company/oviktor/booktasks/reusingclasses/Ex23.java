package com.company.oviktor.booktasks.reusingclasses;

class StaticClass {
    static {
        System.out.println("Loading StaticClass");
    }
    static void staticMethod() {}
}


public class Ex23 {
    public static void main(String[] args) {
        System.out.println("Loading Ex23 class");
        StaticClass.staticMethod();
        System.out.println("Creating a StaticClass object");
        new StaticClass();
    }
}
