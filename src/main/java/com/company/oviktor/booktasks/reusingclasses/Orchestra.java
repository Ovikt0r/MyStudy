package com.company.oviktor.booktasks.reusingclasses;

class Music {
    Music(){
        System.out.println("Music constructor()");
    }
}

public class Orchestra extends Music {
    Orchestra(){
        System.out.println("Orchestra constructor()");
    }

    public static void main(String[] args) {
        Orchestra jazzOrchestra = new Orchestra();
    }
}
