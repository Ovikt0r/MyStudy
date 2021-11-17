package com.company.oviktor.booktasks.initializationcleanup;

public class Ex14 {
    static String s1 = "Initialization at the definition point";
    static String s2;
    static {
        s2 = "Initialization in the static block";
    }

    public static void main(String[] args) {
        System.out.println("s1 = "+ s1);
        System.out.println("s2 = "+ s2);
    }
}
