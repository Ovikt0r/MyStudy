package com.company.oviktor.booktasks.contolingexecution;

import java.util.*;

public class Ex10 {

   // static Set<String> ts = new HashSet<>();
    static SortedSet ss = new TreeSet();
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
        if (i == k * l)
            ss.add(i + "=" + k + "*" + l);
    }

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {

            productVampNumber(i, com(b(i), a(i)), com(c(i), d(i)));
            productVampNumber(i, com(a(i), d(i)), com(c(i), b(i)));
            productVampNumber(i, com(c(i), a(i)), com(b(i), d(i)));

        }
       // List<String> sortedNumbers = new ArrayList<String>(ts);
       // Collections.sort(sortedNumbers);
        System.out.println(ss);

    }
}
