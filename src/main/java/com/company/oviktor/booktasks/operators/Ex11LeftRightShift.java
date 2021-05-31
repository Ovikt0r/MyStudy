package com.company.oviktor.booktasks.operators;

public class Ex11LeftRightShift {
    public static void main(String[] args) {
        int x = -1;
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        System.out.println(Integer.toBinaryString(x));
        for (int i = 0; i < 31; i++) {
            x >>>= 1;
            System.out.println(Integer.toBinaryString(x));
        }
    }
}
