package com.company.oviktor.booktasks.interfaces;


import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharSequence {
    private static final Random random = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();

    char[] generate() {
        char[] buffer = new char[10];
        int index = 0;

        buffer[index++] = capitals[random.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[index++] = lowers[random.nextInt(lowers.length)];
            buffer[index++] = vowels[random.nextInt(vowels.length)];
        }
        buffer[index] = ' ';

        return buffer;
    }
}


public class Ex16 extends CharSequence implements Readable {

    private int count;

    Ex16(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {

        if (count-- == 1) {
            return -1;
        } else {
            char[] buffer = generate();
            cb.put(buffer);
            return buffer.length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Ex16(10));

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
