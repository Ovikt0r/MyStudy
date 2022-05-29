package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

class OneLevelException extends Exception {

}

class SecondLevelException extends OneLevelException {

}

class ThirdLevelException extends SecondLevelException {

}

@Slf4j
class A {
    public void a() throws OneLevelException {
        log.error("One level hierarchy !");
        throw new OneLevelException();
    }
}

@Slf4j
class B extends A {
    @Override
    public void a() throws SecondLevelException {
        log.error("Second level hierarchy !");
        throw new SecondLevelException();
    }
}

@Slf4j
class C extends B {
    @Override
    public void a() throws ThirdLevelException {
        log.error("Third level hierarchy !");
        throw new ThirdLevelException();
    }
}

@Slf4j
public class Ex25 {
    public static void main(String[] args) {
      A c = new C();
        try {
            c.a();
        }
        catch (OneLevelException e) {
            log.error("Caught '" + e + "' exception");
        }
    }
}
