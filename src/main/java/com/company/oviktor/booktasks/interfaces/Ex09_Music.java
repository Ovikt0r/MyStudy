package com.company.oviktor.booktasks.interfaces;

abstract class Instrument {


    int VALUE = 5;
    abstract void play(Note n);
    abstract void adjust();
}


class Wind extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}


public class Ex09_Music {

    public static void main(String[] args) {
        Percussion percussion = new Percussion();
        Wind wind = new Wind();
        Stringed stringed = new Stringed();
        Instrument instrument = new Instrument() {
            @Override
            void play(Note n) {
                System.out.println("I play note " + n);
            }

            @Override
            void adjust() {
                System.out.println(VALUE + " adjust");
            }
        };

        percussion.adjust();
        wind.adjust();
        stringed.adjust();
        stringed.play(Note.C_SHARP);
        wind.play(Note.MIDDLE_C);
        percussion.play(Note.B_FLAT);
        percussion.adjust();
        wind.adjust();
        stringed.adjust();
        instrument.play(Note.C_SHARP);
        instrument.adjust();

    }
}



