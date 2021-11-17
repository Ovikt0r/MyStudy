package com.company.oviktor.booktasks.initializationcleanup;

class Test{
    Test(String s){
        System.out.println("String constructor s = " + s);
    }
}

public class Ex18 {

    public static void main(String[] args) {
        Test[] array = new Test[5];
        for (int i = 0; i < array.length; i++){
            array[i] = new Test(Integer.toString(i));
        }
    }
}
