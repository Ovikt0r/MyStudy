package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;


class ConstructorException extends Exception {
    ConstructorException(String s) {
        super(s);
    }
}
@Slf4j
class FailingConstructor {

    FailingConstructor(boolean fail) throws ConstructorException{
        if (fail) throw new ConstructorException("Exception is caused by constructor");
    }
    public void f() {
        log.info("f() method");
    }
    public void cleanUp() {
        log.info("Cleaning...");
    }
}

@Slf4j
public class Ex22 {

    public static void main(String[] args) {
        for (boolean b = false; ; b = !b) {
            try {
                log.info("Building...");
                FailingConstructor ex22 = new FailingConstructor(b);
                try {
                    ex22.f();
                } finally {
                    ex22.cleanUp();
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}