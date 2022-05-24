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

@Slf4j
public class Ex19_LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            Ex19_LostMessage lm = new Ex19_LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e) {
                    log.info(e.toString());
                }
            }
        } catch (Exception e) {
            log.info(e.toString());
        }
    }
}