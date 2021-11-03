package com.company.oviktor.booktasks.interfaces.thosepack;

public class Ex05 implements com.company.oviktor.booktasks.interfaces.thispack.Ex05 {

    String name;

    public void multiplies() {
    int a = 5;
    int b = 6;
    System.out.println(a * b);
}

    public void myName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public boolean nextString() {
        boolean strng = true;
        System.out.println(false);
        return !strng;
    }

    public static void main(String[] args) {

        new Ex05().myName("Vova");
        new Ex05().multiplies();
        new Ex05().nextString();

    }

}
