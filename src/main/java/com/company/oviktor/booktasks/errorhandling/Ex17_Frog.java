package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Characteristic {
    private final String s;

    Characteristic(String s) {
        this.s = s;
        log.info("Creating Characteristic " + s);
    }

    protected void dispose() {
        log.info("disposing Characteristic " + s);
    }
}
@Slf4j
class Description {
    private final String s;

    Description(String s) {
        this.s = s;
        log.info("Creating Description " + s);
    }

    protected void dispose() {
        log.info("disposing Description " + s);
    }
}
@Slf4j
class LivingCreature {
    private final Characteristic p =
            new Characteristic("is alive");
    private final Description t =
            new Description("Basic Living Creature");

    LivingCreature() {
        log.info("LivingCreature()");
    }

    protected void dispose() {
        log.info("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
@Slf4j
class Animal extends LivingCreature {
    private final Characteristic p =
            new Characteristic("has heart");
    private final Description t =
            new Description("Animal not Vegetable");

    Animal() {
        log.info("Animal()");
    }

    protected void dispose() {
        log.info("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
@Slf4j
class Amphibian extends Animal {
    private final Characteristic p =
            new Characteristic("can live in water");
    private final Description t =
            new Description("Both water and land");

    Amphibian() {
        log.info("Amphibian()");
    }

    protected void dispose() {
        log.info("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
@Slf4j
public class Ex17_Frog extends Amphibian {
    private final Characteristic p = new Characteristic("Croaks");
    private final Description t = new Description("Eats Bugs");

    public Ex17_Frog() {log.info("Frog()");}

    protected void dispose() {
        log.info("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Ex17_Frog frog = new Ex17_Frog();
        try {
            log.info("*****************************************************\n");
            log.info("Empty try block");
        }
        finally {
            log.info("Bye!\n");
            frog.dispose();
        }
        log.info("---------------------------------------------------------\n");
        frog = new Ex17_Frog();
        try {
            log.info("----------------------------------------------------\n");
            log.info("Returning finally from try block");
            return;
        }
        finally {
            log.info("Bye!\n");
            frog.dispose();
        }
    }
}
