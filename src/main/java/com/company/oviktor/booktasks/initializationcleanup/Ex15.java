package com.company.oviktor.booktasks.initializationcleanup;

class Init {
    String a;
    {
        a = "Initialization in initialization block";
    }
    Init(){
        System.out.println("Default constructor: a = " + a);
    }
    Init(int i){
        System.out.println("Int constructor: a = " + a);
    }
}

public class Ex15 {
    public static void main(String[] args) {
        new Init();
        new Init(1);

    }
}
