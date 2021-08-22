package com.company.oviktor.booktasks.reusingclasses;

public class Amphibian {
    void depth(String s, int i) {
        System.out.println("I dive to " + s + " in " + i + " seconds");
    }
    void goTo(String location , double i){

        System.out.println("I go to " + location + " in " + i + " hours");
    }
    void jump(int height){
        System.out.println("I can jump up on " + height + " meters");
    }
}
