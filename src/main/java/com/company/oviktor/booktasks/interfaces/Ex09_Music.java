package com.company.oviktor.booktasks.interfaces;

class Instruments implements Playable {


    public void play(Note n) {
        System.out.println(this + ".play " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }
}

class Wind implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


public class Ex09_Music {

    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
        p.adjust();
    }

    static void tuneAll(Playable[] playable) {
        for(Playable pl : playable) {
            tune(pl);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra  = {new Percussion(),
                                new Stringed(),
                                new Wind(),
                                new Instruments()};
                tuneAll(orchestra);

            }
        }




