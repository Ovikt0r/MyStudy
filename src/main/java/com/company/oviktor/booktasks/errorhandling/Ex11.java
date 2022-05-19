package com.company.oviktor.booktasks.errorhandling;


class NewException2 extends Exception {
}

class TestExceptionChaining {
    static void f()  {
        try {
            g();
        } catch (NewException2 e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    static void g() throws NewException2 {
        throw new NewException2();
    }
}

public class Ex11 {
    public static void main(String[] args) {

            TestExceptionChaining.f();

    }
}
