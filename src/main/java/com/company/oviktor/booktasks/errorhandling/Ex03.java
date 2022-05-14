package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex03 {
    public static void main(String[] args) {

        try {
            String[] strings = new String[10];
            strings[9] = "10th string";
            log.info(strings[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            log.info("exception that i've caught is: " + e);
        }

    }
}
