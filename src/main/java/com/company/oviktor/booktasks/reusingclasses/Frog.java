package com.company.oviktor.booktasks.reusingclasses;

public class Frog extends Amphibian{

    void depth(int i) {
        System.out.println("I can dive on "  + i + " meters");
    }
    void goTo(String location , int d, double h){

        System.out.println("I go to " + location + " in " + d + " days and " + h + " hours");
    }
    void jumpUp(char h){
        System.out.println("I can jump up to" + h + " letter");
    }
}
