package com.company.oviktor.booktasks.innerclasses.three;

import com.company.oviktor.booktasks.innerclasses.two.Concert;
import com.company.oviktor.booktasks.innerclasses.one.Singer;

public class Cl extends Concert{

    public Singer getNext() {
       return new PartOne();
        }

    public static void main(String[] args) {
        new Cl().getNext().boo();
    }
}

