package com.company.oviktor.booktasks.reusingclasses;

class Basis {

    void gene(String name) {
        System.out.println("My name is " + name);
    }
    void gene (String name, double d) {
        System.out.println("My dog name is " + name + " I found him on a street " + d + " years ago");
    }
    void gene(int i) {
        System.out.println("I am " + i + " years old");
    }
}

public class Ex13 extends Basis{

    void gene (char ch) {
        System.out.println("The firs letter my lastname is " + ch);
    }

    public static void main(String[] args) {
        new Ex13().gene("Ivan");
        new Ex13().gene(28);
        new Ex13().gene("Tobic", 2.5);
        new Ex13().gene('F');
    }
}
