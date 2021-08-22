package com.company.oviktor.booktasks.reusingclasses;


public class Ex15_FirstClass{

    protected void setName(String name, int age) {
        System.out.println("My name is " + name + ". " + "I am " + age + " years old");
    }
}

class SecondClass extends Ex15_FirstClass{
    public void m() {
        setName("John", 43);
    }

    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.m();

    }

}
