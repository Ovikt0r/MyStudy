package com.company.oviktor.booktasks.accesscontrol.inpackage;

public class Ex05AccessExamples2 {

    public static void main(String[] args) {
        Ex05AccessExamples1 ex = new Ex05AccessExamples1();
        ex.a = 2;
        //ex.b = 3; - private access level
        ex.c = 4;
        ex.d = 5;

        ex.a();
        //ex.b(); - private access level
        ex.c();
        ex.d();

    }
}
