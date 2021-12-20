package com.company.oviktor.booktasks.innerclasses;

import lombok.extern.slf4j.Slf4j;

 class NoDefaultConstructor {

    int i;
    String bond;

    NoDefaultConstructor(int i, String bond) {
        this.bond = bond;
        this.i = i;
    }
     public void priLog(){
     }
}

@Slf4j
class SecondClass {
    public NoDefaultConstructor getClass(int i, String bond) {
        return new NoDefaultConstructor(i, bond) {
            @Override
            public void priLog() {
                log.info(String.valueOf(i));
                log.info(bond);
            }
        };
    }
}

public class Ex15Class {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        NoDefaultConstructor ex15 = secondClass.getClass(15, "James");
        ex15.priLog();

    }
}
