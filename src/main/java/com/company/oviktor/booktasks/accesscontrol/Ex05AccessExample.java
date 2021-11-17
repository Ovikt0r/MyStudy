package com.company.oviktor.booktasks.accesscontrol;

import com.company.oviktor.booktasks.accesscontrol.inpackage.Ex05AccessExamples1;

public class Ex05AccessExample {


    public static void main(String[] args) {

        Ex05AccessExamples1 ex = new Ex05AccessExamples1();
        ex.a = 4; //public
        //ex.b = 5; private
        //ex.c = 6; protected
        //ex.d = 7; package level

        ex.a(); //public
        //ex.b(); //private
        //ex.c(); //protected
        //ex.d(); //package level


    }
}