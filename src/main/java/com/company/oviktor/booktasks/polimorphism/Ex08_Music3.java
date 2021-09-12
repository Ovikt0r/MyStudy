package com.company.oviktor.booktasks.polimorphism;


import java.util.Random;

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


class RandomGeneratorClass {
    private final Random random = new Random(45);

    public Instrument next() {
        switch (random.nextInt(5)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Bass();
            case 4:
                return new WoodWind();
            case 5:
                return new ContraBass();
        }
    }
}

public class Ex08_Music3 {

    private static RandomGeneratorClass rgc = new RandomGeneratorClass();

    public static void main(String[] args) {

        Instrument[] s = new Instrument[9];

        for(int i = 0; i < s.length; i++) {
            s[i] = rgc.next();
        }
            for (Instrument ins : s) {
                ins.play(Note.C_SHARP);
                ins.adjust();
                System.out.println(ins);
            }
    }
}
