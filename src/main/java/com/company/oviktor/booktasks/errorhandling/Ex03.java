package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

import java.io.PrintWriter;
import java.io.StringWriter;

@Slf4j
public class Ex03 {

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        log.error(trace.toString());
    }
    public static void main(String[] args) {

        try {
            String[] strings = new String[10];
            strings[9] = "10th string";
            log.info(strings[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
            log.info("exception that i've caught is: " + e);
        }

    }
}
