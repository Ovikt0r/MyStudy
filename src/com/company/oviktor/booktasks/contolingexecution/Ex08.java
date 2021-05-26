package com.company.oviktor.booktasks.contolingexecution;


public class Ex08 {


    static void fibonachi(int f) {

        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= f; i++){
           c = a + b;
           System.out.print(c +" ");
           a = b;
           b = c;

        }
    }
    public static void main(String[] args) {
        fibonachi(25);
    }
}