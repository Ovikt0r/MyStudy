package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MyException extends Exception{
    String s;
    public MyException(String s){
        this.s = s;
    }
    public void print() {
        log.info(s);
    }
}


@Slf4j
class TestSpecification{


    static void f() throws MyException {

        throw new MyException("Inside f()");
    }
}

@Slf4j
public class Ex08 {

    public static void main(String[] args) {
        try {
            TestSpecification.f();
        }
        catch (MyException e) {
            e.print();
        }
    }
}
