package com.company.oviktor.booktasks.operators;

    class Dog {
        String name;
        String say;
        }
public class Ex07EqualsExample {

        public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.say = "Av-av-av-av";
            Dog d2 = new Dog();
            d2.name = "Scruffy";
            d2.say = "Gav gav gav";
            Dog d3 = new Dog();
            d1.name = d3.name = "Spot";
            System.out.println((d3.name.equals(d1.name)));
            System.out.println(d3.name == d1.name);
            System.out.println("d3 name : " + d3.name);


    }
}
