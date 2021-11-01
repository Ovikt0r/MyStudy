package com.company.oviktor.booktasks.reusingclasses;

class Component1 {
    Component1(String s1) {
        System.out.println(s1);
    }
}

class Component2 {
    Component2(String s2) {
        System.out.println(s2);
    }
}

class Component3 {
    Component3(String s3) {
        System.out.println(s3);
    }
}

class Root {
    Component1 c1 = new Component1("Calling Component1");
    Component2 c2 = new Component2("Calling Component2");
    Component3 c3 = new Component3("Calling Component3");

    Root(String r) {
        System.out.println(r);
    }
}

class Stem extends Root {
    Component1 c1 = new Component1("Calling Component1");
    Component2 c2 = new Component2("Calling Component2");
    Component3 c3 = new Component3("Calling Component3");

    Stem(String st) {
        super("Calling Root");
        System.out.println(st);
    }
}

public class Ex10 {
    public static void main(String[] args) {
        new Stem("Calling Stem");
    }
}
