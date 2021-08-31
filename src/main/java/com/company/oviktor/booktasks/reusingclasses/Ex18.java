package com.company.oviktor.booktasks.reusingclasses;


class ClassCounter {
    private static int count;
    private int i = count++;
    public String toString() {
        return "ClassCounter " + i;
    }
}

class ClassWithFinal {
    final ClassCounter cc1 = new ClassCounter();
    final static ClassCounter cc2 = new ClassCounter();
    public String toString() {
       return  "cc1 = " + cc1 + "\n" + "cc2 = " + cc2;
    }
}



public class Ex18 {

    public static void main(String[] args) {
        System.out.println("First object :");
        System.out.println(new ClassWithFinal());
        System.out.println("Second object : ");
        System.out.println(new ClassWithFinal());
    }


}
