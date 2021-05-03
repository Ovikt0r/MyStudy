package com.company.oviktor.booktasks.operators;

public class Ex10BitwiseOperators {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;
        long x = -8L;
        int y = -1;

        System.out.println("a is : " + Integer.toBinaryString(a));
        System.out.println("b is : " + Integer.toBinaryString(b));
        System.out.println("Operator ~a is : " + Integer.toBinaryString(~a));
        System.out.println("Operator ~b is : " + Integer.toBinaryString(~b));
        System.out.println("a & a is : " + Integer.toBinaryString(a & a));
        System.out.println("a | a is : " + Integer.toBinaryString(a | a));
        System.out.println("a ^ a is : " + Integer.toBinaryString(a ^ a));
        System.out.println("a & b is : " + Integer.toBinaryString(a & b));
        System.out.println("a | b is : " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b is : " + Integer.toBinaryString(a ^ b));
        System.out.println(Long.toBinaryString(x));
        System.out.println(x >>> 1);
        System.out.println(Long.toBinaryString(x));
        System.out.println(x >>> 2);
        System.out.println(Long.toBinaryString(x));


    }

}
