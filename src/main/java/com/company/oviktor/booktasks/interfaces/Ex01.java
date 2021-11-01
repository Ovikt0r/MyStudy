package com.company.oviktor.booktasks.interfaces;


import java.util.Random;

abstract class Rodent {

    void printClass() {System.out.println("I belong to Rodent");}

    abstract void printName() ;

    abstract void printAge();
    }


class Mouse extends Rodent {

    void printName () {
        System.out.println("I am a Mouse");
    }

    void printAge() {
        System.out.println("I have been living since 20 million years ago");
    }
}

class Hamster extends Rodent {

    void printName () {
        System.out.println("I am a Hamster");
    }

    void printAge() {
        System.out.println("I have been living since 5 million years ago");
    }
}
class Rat extends Rodent {

    void printName () {
        System.out.println("I am a Rat");
    }

    void printAge() {
        System.out.println("I have been living since 15 million years ago");
    }
}
class Chipmunk extends Rodent{

    void printName () {
        System.out.println("I am a Chipmunk");
    }

    void printAge() {
        System.out.println("I have been living since 10 million years ago");
    }
}


class RandomGenerator {
    Random random = new Random(45);

    public Rodent next() {
        switch (random.nextInt(8)) {
            default:
            case 1:
            case 4:
                return new Chipmunk();
            case 2:
            case 7:
                return new Hamster();
            case 3:
            case 5:
                return new Mouse();
            case 6:
            case 0:
                return new Rat();

        }

    }

}



public class Ex01 {
    public static void main(String[] args) {

        RandomGenerator randomGenerator = new RandomGenerator();
        Rodent[] rodent = new Rodent[8];
        for (int i = 0; i < rodent.length; i++) {
            rodent[i] = randomGenerator.next();
        }
        for (Rodent rd : rodent) {
            rd.printName();
            rd.printClass();
            rd.printAge();


        }

    }
}

