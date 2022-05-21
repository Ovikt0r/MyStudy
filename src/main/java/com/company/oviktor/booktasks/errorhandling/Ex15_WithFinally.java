package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex15_WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                // Code that can throw exceptions...
                OnOffSwitch.f();
            } catch (OnOffException1 e) {
                System.out.println("OnOffException1");
            } catch (OnOffException2 e) {
                System.out.println("OnOffException2");
            } finally {
                sw.off();
            }
        }
        catch (RuntimeException e) {
            log.error("Despite on the exception '" + e + "'");
            log.error("the finally block has done successfully! You can see it below : ");
            log.info(sw.toString());
        }
    }
    }