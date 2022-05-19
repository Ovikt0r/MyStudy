package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class NewException extends Exception {}

@Slf4j
class NewException2 extends Exception {}

    class TestExceptionChaining {
        static void f() throws NewException2 {
            try {
                g();
            } catch (NewException e) {
                e.printStackTrace();
                throw new NewException2();
            }
        }

        static void g() throws NewException {
            throw new NewException();
        }
    }

    public class Ex10 {
        public static void main(String[] args) {
            try {
                TestExceptionChaining.f();
            }
            catch (NewException2 e) {
                System.out.println("Caught ------> " + e);
            }
        }
    }
