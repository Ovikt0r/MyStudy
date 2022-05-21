package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex14_OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1,OnOffException2 {
        throw new RuntimeException("Inside try block");
    }
    public static void main(String[] args) {

        try {
            try {
                sw.on();
                f();
                sw.off();
            } catch(OnOffException1 e) {
                System.out.println("OnOffException1");
                sw.off();
            } catch(OnOffException2 e) {
                System.out.println("OnOffException2");
                sw.off();
            }
        }
        catch (RuntimeException e) {
            log.info(sw.toString());
            log.error("Oops! The exception '" + e + "' throws without turning switch off !");
        }
    }
}
