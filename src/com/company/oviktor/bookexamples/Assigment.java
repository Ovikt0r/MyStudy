package com.company.oviktor.bookexamples;

import com.company.oviktor.tools.*;

class Tank {
    int level;

}
public class Assigment {
    public static void main(String[] args) {
        Print p1;
        p1 = new Print();
        Tank t1;
        t1 = new Tank();
        Tank t2;
        t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        p1.print(" 1: t1.level: " + t1.level + ", t2.level: " + t2.level+ "\n");
        t1=t2;
        p1.print(" 2: t1.level: " + t1.level + ", t2.level: " + t2.level+ "\n");
        t1.level = 27;
        p1.print(" 3: t1.level: " + t1.level + ", t2.level: " + t2.level+ "\n");

    }
    }

