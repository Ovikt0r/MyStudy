package com.company.oviktor.booktasks.erroehandling;

import lombok.extern.slf4j.Slf4j;

import java.io.PrintWriter;
import java.io.*;

@Slf4j
class LogException1 extends Exception {

    LogException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        log.error(trace.toString());
    }
}

@Slf4j
class LogException2 extends Exception {
    LogException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        log.error(trace.toString());
    }
}

public class Ex06 {

    public static void main(String[] args) {
        try {
            throw new LogException1();
        } catch (LogException1 e) {
            System.err.println("I caught LogException1");
        }
        try {
            throw new LogException2();
        } catch (LogException2 e) {
            System.err.println("I caught LogException!");
        }
    }
}
