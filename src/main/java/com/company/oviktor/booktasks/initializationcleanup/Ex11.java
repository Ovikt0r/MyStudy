package com.company.oviktor.booktasks.initializationcleanup;

public class Ex11 {

    protected void finalize() {
        System.out.println("some message");
    }

    public static void main(String[] args) {


        while (true) {
            new Ex11();
        }
    }

}