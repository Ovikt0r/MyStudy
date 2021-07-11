package com.company.oviktor.booktasks.initializationcleanup;

public class Ex10 {

    protected void finalize(){
        System.out.println("some message");
    }

    public static void main(String[] args) {
        new Ex10();
    }

}
