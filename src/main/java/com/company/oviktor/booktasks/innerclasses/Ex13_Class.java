package com.company.oviktor.booktasks.innerclasses;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Out {

    public Frieable testAccess() {
        return new Frieable() {
            final int i = 34;

            @Override
            public int warmUp() {
                return i;
            }
        };
    }
}

@Slf4j
public class Ex13_Class {
    public static void main(String[] args) {
        Out out = new Out();
        Frieable frieable = out.testAccess();
        log.info("I'm " + frieable.warmUp() + " years old");
    }
}


