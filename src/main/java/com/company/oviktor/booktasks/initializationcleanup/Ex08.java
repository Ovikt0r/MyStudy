package com.company.oviktor.booktasks.initializationcleanup;

public class Ex08 {

    public void m1(){
        m2();
        this.m2();
    }
    public void m2(){
        System.out.println("Method 2 calling");
    }

    public static void main(String[] args) {
        new Ex08().m1();

    }
}

