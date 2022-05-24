package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;


class Except extends Exception {
    Except(String s) {
        super(s);
    }
}

class BaseClass {

    BaseClass() throws Except {
        throw new Except("From Baseclass");
    }
}

class DerivedClass extends BaseClass {

    DerivedClass() throws Except {
        super();
    }

    @Slf4j
    public static class Ex21 {
        public static void main(String[] args) {
            try {
                new DerivedClass();
            } catch (Except e) {
                log.info("The exception caught in main");
            }
        }
    }
}
