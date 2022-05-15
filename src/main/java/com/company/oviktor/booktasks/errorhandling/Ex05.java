package com.company.oviktor.booktasks.errorhandling;


import lombok.extern.slf4j.Slf4j;

class CustomException extends Exception {}

class Repeater{
    static int count = 10;
    static void f() throws CustomException {
        if(count-- >0) {
            throw new CustomException();
        }
    }
}
@Slf4j
public class Ex05 {

    public static void main(String[] args) {
            while (true) {
                try {
                    Repeater.f();
                }
                catch (CustomException e ) {
                    log.info("I've caught");
                    continue;
                }
                log.info("All loop passed");
                break;
            }
            log.info("Program has worked out successful");

    }
}
