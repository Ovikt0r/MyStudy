package com.company.oviktor.booktasks.operators;

public class Ex14StringEquals {

    static void p(boolean b) {
        if (b ==true) System.out.println(true);
        else System.out.println(false);
    }

    static void compare (String s1, String s2) {
        p(s1==s2);
        p(s1!=s2);
        p(s1.equals(s2));
        p(s2.equals(s1));
    }

    public static void main(String[] args) {
        String s1 = "raja", s2 = "ajar";
        compare(s1,s2);

    }

}
