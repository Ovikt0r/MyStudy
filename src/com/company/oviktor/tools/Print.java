package com.company.oviktor.tools;

import java.io.*;

public class Print {
    // Print with a newline:
    public static void println(Object obj) {
        System.out.println(obj);
    }
    // Print newline:
    public static void println() {
        System.out.println();
    }
    // Print with no line break:
    public static void print(Object obj) {
        System.out.print(obj);
    }
    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}