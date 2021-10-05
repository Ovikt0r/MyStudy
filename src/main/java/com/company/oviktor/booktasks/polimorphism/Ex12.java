package com.company.oviktor.booktasks.polimorphism;

import java.util.Random;

class Rodent {

    void printClass() {
        System.out.println("I belong to Rodent");
    }

    void printName() {
        System.out.println("I am a Rodent");
    }

    void printAge() {
        System.out.println("I have been living since 25 million years ago");
    }

}

class Mouse extends Rodent {

    void printName() {
        System.out.println("I am a Mouse");
    }

    void printAge() {
        System.out.println("I have been living since 20 million years ago");
    }
}

class Hamster extends Rodent {

    void printName() {
        System.out.println("I am a Hamster");
    }

    void printAge() {
        System.out.println("I have been living since 5 million years ago");
    }
}

class Rat extends Rodent {

    void printName() {
        System.out.println("I am a Rat");
    }

    void printAge() {
        System.out.println("I have been living since 15 million years ago");
    }
}

class Chipmunk extends Rodent {

    void printName() {
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
                return new Chipmunk();
            case 2:
                return new Hamster();
            case 3:
                return new Mouse();
            case 4:
                return new Rodent();
            case 5:
                return new Mouse();
            case 6:
                return new Rat();
            case 7:
                return new Hamster();
            case 0:
                return new Rodent();

        }

    }

}


public class Ex12 {
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
