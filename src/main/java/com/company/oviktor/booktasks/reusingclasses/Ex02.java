package com.company.oviktor.booktasks.reusingclasses;

public class Ex02 extends Detergent{

    public void scrub () {
        append("Ex02.scrub() ");
    }

    public void sterilize() {
        append("sterilize()");
    }

    public static void main(String[] args) {
        Ex02 x = new Ex02();
        x.apply();
        x.dilute();
        x.scrub();
        x.sterilize();
        System.out.println(x);
    }

}
