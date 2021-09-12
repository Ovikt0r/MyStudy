package com.company.oviktor.booktasks.polimorphism;


class Instrument {
    void play (Note n) { System.out.println("Instrument play note " + n);}
    public String toString() {return "Instrument";}
    void adjust() {System.out.println("Adjusting Instrument");}
}

class Wind extends Instrument {
    void play (Note n) { System.out.println("Wind play note " + n);}
    public String toString() { return "Wind";}
    void adjust() {System.out.println("Adjusting Wind");}

}

class Percussion extends Instrument {
    void play (Note n) { System.out.println("Percussion play note " + n);}
    public String toString() { return "Percussion";}
    void adjust() {System.out.println("Adjusting Percussion");}

}
class Stringed extends Instrument {
    void play (Note n) { System.out.println("Stringed play note " + n);}
    public String toString() { return "Stringed";}
    void adjust() {System.out.println("Adjusting Stringed");}

}
class Bass extends Wind {
    void play (Note n) { System.out.println("Bass play note " + n);}
    void adjust() {System.out.println("Bass Instrument");}

}
class WoodWind extends Wind {
    void play (Note n) { System.out.println("WoodWind play note " + n);}
    void adjust() {System.out.println("WoodWind Instrument");}

}

public class Ex06_Music3 {


    public static void tuneAll (Instrument[] e) {
        for(Instrument i : e) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Bass(),
                new WoodWind()};
        tuneAll(orchestra);
    }
}
