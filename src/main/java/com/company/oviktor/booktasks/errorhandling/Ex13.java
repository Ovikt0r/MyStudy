package com.company.oviktor.booktasks.errorhandling;


import lombok.extern.slf4j.Slf4j;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
class MyException2 extends Exception{
    MyException2(String s){
        super(s);
    }
}

class MyException3 extends Exception{
    MyException3(String s){
        super(s);
    }
}

@Slf4j
public class Ex13 {
    static void f(int x) throws MyException, MyException2, MyException3 {
        if (x > 0) throw new MyException("MyException thrown cause x > 0");
        if (x < 0) throw new MyException2("MyException2 thrown cause x < 0 ");
        if (x == 20) throw new MyException3("MyException3 thrown cause x = 20 ");
    }
    static void finallyThrow() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            f(-1);
            f(1);
            f(20);
        }
        catch (Exception e) {
            log.info("I caught all exceptions");
            e.printStackTrace(System.out);
        }
        finally {
            log.info("Null Pointer !");
            finallyThrow();

        }

    }
}