package com.company.oviktor.booktasks.contolingexecution;


public class Ex08 {


    static int fibonachi(int f) {

        if (f <= 2)
            return 1;

        return fibonachi(f - 1) + fibonachi(f - 2);

    }

    public static void main(String[] args) {

        int b = 5;
        for (int i = 1; i <= b; i++) {
            System.out.print(fibonachi(i) + ", ");
        }
    }
}
