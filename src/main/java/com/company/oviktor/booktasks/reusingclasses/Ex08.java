package com.company.oviktor.booktasks.reusingclasses;


class Base {
    public Base(String b){
        System.out.println("Base class not default constructor with string " + b);
    }
}

public class Ex08 extends Base {
    public Ex08(){
        super("First string argument");
        System.out.println("Constructor derived class");
    }
    public Ex08(String c) {
        super("Second string argument");
        System.out.println("Ex08 constructor argument is " + c);
    }

    public static void main(String[] args) {
        Ex08 ex = new Ex08();
        Ex08 ex2 = new Ex08("...some string");
    }

}
