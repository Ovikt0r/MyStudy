package com.company.oviktor.booktasks.accesscontrol.inpackage;

class TheProtected{
    protected int i;
}


public class Ex06 {

    public static void main(String[] args) {
        TheProtected tp = new TheProtected();
        tp.i = 25;
        System.out.println("tp.i = " + tp.i);
    }

}
