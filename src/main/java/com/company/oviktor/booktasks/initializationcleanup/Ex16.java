package com.company.oviktor.booktasks.initializationcleanup;

public class Ex16 {

    public static void main(String[] args) {
        String[] sa1 = {"These", "are", "array", "of", "strings."};

        for (String s : sa1) {
            System.out.println(s);
        }

        String[] sa2 = new String[5];
        sa2[0] = "These";
        sa2[1] = "are";
        sa2[2] = "array";
        sa2[3] = "of";
        sa2[4] = "strings.";

        for (String s : sa2) {
            System.out.println(s);

        }

    }
}
