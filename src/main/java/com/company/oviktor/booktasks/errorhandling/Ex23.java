package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;


class ConstructorException extends Exception {
    ConstructorException(String s) {
        super(s);
    }
}

@Slf4j
class Terminate {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        log.info("Object " + id + " is free");

    }
}

@Slf4j
class FailingConstructor {
    Terminate t1;
    FailingConstructor(boolean fail) throws ConstructorException {
        t1 = new Terminate();
        try {
            if (fail) throw new ConstructorException("Exception is caused by constructor");
        } catch (ConstructorException e) {
            Terminate t2 = new Terminate();
            t2.dispose();
            throw e;
        }
    }
}


@Slf4j
public class Ex23 {

    public static void main(String[] args) {
        for (boolean b = false; ; b = !b) {
            try {
                log.info("Building...");
                FailingConstructor ex22 = new FailingConstructor(b);
                try {
                    log.info("Processing....");
                } finally {
                    log.info("Clean up");
                }
            } catch (ConstructorException e) {
                log.info("Constructing has failed :" + e);
                break;
            }
        }
    }
}