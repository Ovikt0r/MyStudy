package com.company.oviktor.booktasks.contolingexecution;

public class Ex10 {

    static int a (int i) {
        return i/1000;
    }
    static int b (int i) {
        return (i%1000)/100;
    }
    static int c (int i) {
        return ((i%1000)%100)/10;
    }
    static int d (int i){
        return ((i%1000)%100)%10;
    }
    static int com (int z, int y) {
        return (z * 10) + y;
    }
    static void productVampNumber (int i, int k, int l) {
            if (i == k * l) {
                System.out.println(i + "=" + k + "*" + l);
            }
        }
    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {
            productVampNumber(i, com(a(i), b(i)), com(c(i), d(i)));
            productVampNumber(i, com(a(i), b(i)), com(d(i), c(i)));
            productVampNumber(i, com(a(i), c(i)), com(b(i), d(i)));
            productVampNumber(i, com(a(i), c(i)), com(d(i), b(i)));
            productVampNumber(i, com(a(i), d(i)), com(b(i), c(i)));
            productVampNumber(i, com(a(i), d(i)), com(c(i), b(i)));
            productVampNumber(i, com(b(i), a(i)), com(c(i), d(i)));
            productVampNumber(i, com(b(i), a(i)), com(d(i), c(i)));
            productVampNumber(i, com(b(i), c(i)), com(d(i), a(i)));
            productVampNumber(i, com(b(i), d(i)), com(c(i), a(i)));

        }
    }
}
