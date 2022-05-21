package com.company.oviktor.booktasks.errorhandling;

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException("Inside try block");
    }
}
