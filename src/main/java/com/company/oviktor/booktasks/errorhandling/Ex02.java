package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;


@Slf4j
class SomeNull{
    public void f() {
        log.info("This is invoked by null reference");
    }
}

@Slf4j
public class Ex02 {

    public static void main(String[] args) {

        try {
            SomeNull someNull = null;
            someNull.f();
            throw new NullPointerException();
        }
        catch (NullPointerException e) {
            log.info("I've caught it " + e);
        }
    }
}
