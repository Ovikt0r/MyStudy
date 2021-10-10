package com.company.oviktor.booktasks.polimorphism;

import java.util.Random;

class NonSharedMember {
    public NonSharedMember (String id) {
        System.out.println("Non shared member constructor " + id);
    }
}

class SharedMember {
    private int countRef;

    public void addRef() {
        System.out.println("Number of reference " + ++countRef);
    }
    protected void dispose() {
        if(--countRef == 0) {
            System.out.println("Disposing " + this);
        }
    }
    public SharedMember() {
        System.out.println("Shared member constructor");
    }

    public String toString() {
        return "Shared member";
    }
}

class Rodent {

    private SharedMember sharedMember;

    NonSharedMember nonSharedMember1 = new NonSharedMember("rodent1");
    NonSharedMember nonSharedMember2 = new NonSharedMember("rodent2");

    public Rodent(SharedMember shm) {
        System.out.println("Rodent constructor");
        sharedMember = shm;
        sharedMember.addRef();
    }

    void printClass() {
        System.out.println("I belong to Rodent");
    }

    void printName() {
        System.out.println("I am a Rodent");
    }

    void printAge() {
        System.out.println("I have been living since 25 million years ago");
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        sharedMember.dispose();
    }
    public String toString() {
        return "Rodent";
    }

}

class Mouse extends Rodent {

    NonSharedMember nonSharedMember1 = new NonSharedMember("mouse1");
    NonSharedMember nonSharedMember2 = new NonSharedMember("mouse2");

    public Mouse(SharedMember shm) {
        super(shm);
        System.out.println("Mouse constructor");
    }

    void printName() {
        System.out.println("I am a Mouse");
    }

    void printAge() {
        System.out.println("I have been living since 20 million years ago");
    }

    public String toString() {return "Mouse";}
}

class Hamster extends Rodent {

    private SharedMember shm;

    NonSharedMember nonSharedMember1 = new NonSharedMember("hamster1");
    NonSharedMember nonSharedMember2 = new NonSharedMember("hamster1");

    public Hamster(SharedMember shm) {
        super(shm);
        System.out.println("Hamster constructor");
    }

    void printName() {
        System.out.println("I am a Hamster");
    }

    void printAge() {
        System.out.println("I have been living since 5 million years ago");
    }

    public String toString() { return "Hamster";}
}

class Rat extends Rodent {

    private SharedMember shm;

    NonSharedMember nonSharedMember1 = new NonSharedMember("rat1");
    NonSharedMember nonSharedMember2 = new NonSharedMember("rat2");

    public Rat(SharedMember shm) {
        super(shm);
        System.out.println("Rat constructor");
    }

    void printName() {
        System.out.println("I am a Rat");
    }

    void printAge() {
        System.out.println("I have been living since 15 million years ago");
    }

    public String toString() {return "Rat";}
}


class Chipmunk extends Rodent {

    private SharedMember shm;

    NonSharedMember nonSharedMember1 = new NonSharedMember("chipmunk1");
    NonSharedMember nonSharedMember2 = new NonSharedMember("chipmunk2");

    public Chipmunk(SharedMember shm) {
        super(shm);
        System.out.println("Chipmunk constructor");
    }

    void printName() {
        System.out.println("I am a Chipmunk");
    }

    void printAge() {
        System.out.println("I have been living since 10 million years ago");
    }

    public String toString() {return "Chipmunk";}
}


public class Ex15 {
    public static void main(String[] args) {

        SharedMember sharedMember = new SharedMember();

        Rodent[] rodents = {
                new Hamster(sharedMember),
                new Rat(sharedMember),
                new Chipmunk(sharedMember)
        };
        for (Rodent rodent : rodents )
            rodent.dispose();
    }
}
