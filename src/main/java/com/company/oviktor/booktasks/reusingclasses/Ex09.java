package com.company.oviktor.booktasks.reusingclasses;

class Component1 {
    Component1(){
        System.out.println("Calling Component1 ");
    }
}

class Component2 {
    Component2(){
        System.out.println("Calling Component2");
    }
}

class Component3 {
    Component3(){
        System.out.println("Calling Component3");
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    Root(){
        System.out.println("Calling Root");
    }
}

class Stem extends Root{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    Stem() {
        System.out.println("Calling Stem");
    }
}

public class Ex09 {
    public static void main(String[] args) {
        new Stem();
    }
}
