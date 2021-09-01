package com.company.oviktor.booktasks.reusingclasses;


class AnyClass {
    private int i;
    AnyClass (int i) {
        this.i  = i;
    }
    public String toString () {
        return "AnyClass " + i;
    }
}


public class Ex19 {

    private final AnyClass a;

    Ex19(){
        a = new AnyClass(1);
    }

    Ex19(int i) {
        a = new AnyClass(i);
    }

    public static void main(String[] args) {
        Ex19 ex1 = new Ex19();
        Ex19 ex2 = new Ex19(27);
        //ex1.a = new AnyClass(4);
        //ex2.a = new AnyClass(6);
        System.out.println("ex1.a = " + ex1.a);
        System.out.println("ex2.a = " + ex2.a );

    }
}


