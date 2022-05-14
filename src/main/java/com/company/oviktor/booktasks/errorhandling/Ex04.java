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

class MyException2 extends Exception {

    public MyException2(String s) {
        super(s);
    }
}
@Slf4j
public class Ex04 {
    public static void main(String[] args) {
        try {
            throw new MyException("!String exception!");
        }
        catch (MyException e) {
            e.print();
        }
        try {
            throw new MyException2("!String second exception!");
        }
        catch (MyException2 e) {
            log.info("e.getMessage: " + e.getMessage());
        }
    }
}
