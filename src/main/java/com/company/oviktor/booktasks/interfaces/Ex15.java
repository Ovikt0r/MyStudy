package com.company.oviktor.booktasks.interfaces;


abstract class Human {
    String s;
    Human(String s) {
        this.s = s;
    }
    abstract void af();
}

class Person extends Human implements Relationship {
    Person() {super("Though");}
    public void af() {System.out.println("Person.af");}
    public void make() {System.out.println("Person.make");}
    public void does() {System.out.println("Person.does");}
    public void take() {System.out.println("Person.take");}
    public void give() {System.out.println("Person.give");}
    public void get() {System.out.println("Person.get");}
    public void keep() {System.out.println("Person.keep");}
    public void connect() {System.out.println("Person.connect");}

}


public class Ex15 {

    static void meth1(Admirable a) {
        a.make();
        a.does();
    }

    static void meth2(Adorable b) {
        b.give();
        b.take();
    }

    static void meth3(Cryable c) {
        c.get();
        c.keep();
    }

    static void methAll(Person p) {
        p.does();
        p.get();
        p.give();
        p.keep();
        p.take();
        p.connect();
        p.make();
    }

    static void abstractMeth(Human h) {
        h.af();
    }

    public static void main(String[] args) {
        Person p = new Person();
        meth1(p);
        meth2(p);
        meth3(p);
        methAll(p);
        abstractMeth(p);
    }

}
