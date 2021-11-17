package com.company.oviktor.booktasks.initializationcleanup;

class Dog2 {

    void bark(int i, String s) {
        System.out.println("Integer " + i + " is located at the first place," + " Sharik says: " + s);
    }

    void bark(String s, int i) {
        System.out.println("Sharik says: " + s + ", Integer " + i + " is located at the second place" );
    }

    static public class Ex06 {
        public static void main(String[] args) {
            Dog2 sharik = new Dog2();
            sharik.bark(1, "gav gav gav");
            sharik.bark("au au au ", 2);
        }

    }
}