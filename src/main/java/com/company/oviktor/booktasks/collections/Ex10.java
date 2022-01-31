package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
@Slf4j
class Rodent {

    void printClass() {
        log.info("I belong to Rodent");
    }

    void printName() {
        log.info("I am a Rodent");
    }

    void printAge() {
        log.info("I have been living since 25 million years ago");
    }

}
@Slf4j
class Mouse extends Rodent {

    void printName() {
        log.info("I am a Mouse");
    }

    void printAge() {
        log.info("I have been living since 20 million years ago");
    }
}
@Slf4j
class Hamster extends Rodent {

    void printName() {
        log.info("I am a Hamster");
    }

    void printAge() {
        log.info("I have been living since 5 million years ago");
    }
}
@Slf4j
class Rat extends Rodent {

    void printName() {
        log.info("I am a Rat");
    }

    void printAge() {
        log.info("I have been living since 15 million years ago");
    }
}
@Slf4j
class Chipmunk extends Rodent {

    void printName() {
        log.info("I am a Chipmunk");
    }

    void printAge() {
        log.info("I have been living since 10 million years ago");
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

@Slf4j
public class Ex10 {

    private static final RandomGenerator generator = new RandomGenerator();

    public static void main(String[] args) {

        ArrayList<Rodent> rodentsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rodentsList.add(generator.next());
        }
        Iterator<Rodent> it = rodentsList.iterator();
        while (it.hasNext()) {
            Rodent r = it.next();
            r.printAge();
            r.printClass();
            r.printName();
            log.info(String.valueOf(r));

        }

    }
}
