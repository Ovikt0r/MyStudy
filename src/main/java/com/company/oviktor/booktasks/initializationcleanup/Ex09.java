package com.company.oviktor.booktasks.initializationcleanup;

public class Ex09 {

    String s;
    Ex09(){
        this("It's an argument of the second constructor");
    }
    Ex09(String s){
        this.s = s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Ex09();
    }
}
