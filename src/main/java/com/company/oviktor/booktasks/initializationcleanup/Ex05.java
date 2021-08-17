package com.company.oviktor.booktasks.initializationcleanup;

class Dog {
    void bark (){
        System.out.println("gav gav gav");
    }
    void bark (int i){
        System.out.println("integer type = auauauau");
    }
    void bark (double d){
        System.out.println("double d = auuuuuuuuu");
    }

static public class Ex05 {
    public static void main(String[] args) {
        Dog sharik = new Dog();
        sharik.bark();
        sharik.bark(1);
        sharik.bark(2.5);
    }

}




}
