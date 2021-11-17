package com.company.oviktor.booktasks.initializationcleanup;

class Test{
    Test(String s){
        System.out.println("String constructor s = " + s);
    }
}

public class Ex17 {
    Test[] array1 = new Test[5];

    public static void main(String[] args) {
        Test[] array2 = new Test[5];
    }
}
