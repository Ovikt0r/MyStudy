package com.company.oviktor.booktasks.initializationcleanup;

public class Ex02 {

    String d = "Это строка иницициализированнна прямо в точке определения";
    String b;
    Ex02(String g){
        b = g;
    }

    public static void main(String[] args) {

        Ex02 exml = new Ex02("Эта строка иницализированна в конструкторе");
        System.out.println("d = " + exml.d);
        System.out.println("b = " + exml.b);

    }
}
