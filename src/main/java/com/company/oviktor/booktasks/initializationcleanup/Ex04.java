package com.company.oviktor.booktasks.initializationcleanup;

public class Ex04 {

    Ex04(){
        System.out.println("It's the message of the class");
    }

    Ex04(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Ex04();
        new Ex04("bla-bla-bla, it's overloading constructor");
    }
}
