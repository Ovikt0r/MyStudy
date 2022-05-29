package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MyException extends RuntimeException{
    String s;
    public MyException(String s){
        super(s);
    }

}


@Slf4j
public class Ex28 {
    public static void main(String[] args) {

            throw new MyException("!String exception!");

    }
}
