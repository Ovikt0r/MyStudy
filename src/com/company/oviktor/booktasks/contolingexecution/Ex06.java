package com.company.oviktor.booktasks.contolingexecution;

public class Ex06 {
    static void breakTest() {
        for (int i = 1; i <= 100; ++i) {
            if (i==99) {
                break;
            }
            System.out.println(i);
        }
    }

    static void returnTest() {
        for (int i = 1; i <= 100; ++i) {
            if (i == 99) {
                return;
            }
            System.out.println(i);
        }

    }


    public static void main(String[] args) {
        breakTest();
        returnTest();
    }
}


