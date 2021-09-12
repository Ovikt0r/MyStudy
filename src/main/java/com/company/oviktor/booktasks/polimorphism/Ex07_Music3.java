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
    public String toString() {return "Bass";}
    void adjust() {System.out.println("Bass Instrument");}

}
class WoodWind extends Wind {
    void play (Note n) { System.out.println("WoodWind play note " + n);}
    void adjust() {System.out.println("WoodWind Instrument");}

}

class ContraBass extends Instrument {
    void play (Note n) { System.out.println("Contrabass play note " + n);}
    public String toString() {return "Contrabass";}
    void adjust() { System.out.println("Contrabass instrument"); }
}

public class Ex07_Music3 {


   static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Bass(),
            new WoodWind(),
            new ContraBass()};

    public static void main(String[] args) {

        for (Instrument i : orchestra) {
            i.play(Note.C_SHARP);
            i.adjust();
            System.out.println(i);
        }
    }
}
