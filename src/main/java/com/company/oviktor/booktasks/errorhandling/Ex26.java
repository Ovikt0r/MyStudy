package com.company.oviktor.booktasks.errorhandling;

import java.io.*;

public class Ex26 {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file =
                new FileInputStream("Ex26.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
