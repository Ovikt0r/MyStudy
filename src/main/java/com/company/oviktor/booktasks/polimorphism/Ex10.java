package com.company.oviktor.booktasks.polimorphism;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Ships {

    void setSail() {

        System.out.println("We need to set sail !");
        checkSail();
    }

    void checkSail() {

        String s = "Has been set the sail ? ";
        String a = "- Yes!";
        System.out.println(s + a);
    }

}
class Schooner extends Ships{

    void checkSail() {

        String s = "Are you ready set the sail ? ";
        String a = "- Yes!";
        System.out.println(s + a);
    }

}
public class Ex10 {

    public static void main(String[] args) {

        Ships schooner = new Schooner();
        schooner.checkSail();


    }

}
