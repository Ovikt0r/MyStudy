package com.company.oviktor.booktasks.interfaces;

class Person implements Relationship{
    public void make() {
        System.out.println("I made myself ");
    }
}


public class Ex14 {

    public static void main(String[] args) {
        new Person().make();
    }

}
