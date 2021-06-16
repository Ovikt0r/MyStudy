package com.company.oviktor.booktasks.contolingexecution;

public class Ex05 {

    static boolean test(int test, int begin, int end) {
        return test >= begin && test <= end;
    }

    public static void main(String[] args) {
        System.out.println(test(5, 4,20));
        System.out.println(test(90, 5,20));
        System.out.println(test(4, 4,21));
        System.out.println(test(20, 4,20));

    }
}
