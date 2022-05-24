package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}
class ThirdException extends Exception {
    public String toString() {
        return "That exception loses the rest ";
    }
}
@Slf4j
public class Ex18_LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void cleanAll() throws ThirdException {
        throw new ThirdException();
    }

    public static void main(String[] args) throws VeryImportantException, HoHumException, ThirdException {

        try {
            Ex18_LostMessage lm = new Ex18_LostMessage();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.cleanAll();
            }
        }
        catch (Exception e) {
            log.info(e.toString());
        }
    }
}
