package com.company.oviktor.booktasks.reusingclasses;


class BaseClass {
    final void f(){
        System.out.println("text ");
    }
}


public class Ex21 extends BaseClass {
    void f() {
        System.out.println("Some text yet");
    }

    public static void main(String[] args) {

    }
}