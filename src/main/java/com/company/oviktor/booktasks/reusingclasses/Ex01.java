package com.company.oviktor.booktasks.reusingclasses;


class SimpleClass {
    private final String s;

    SimpleClass() {
        System.out.println("But SimpleClass() constructor was initialized previously ");
        s = "has constructed !";
    }
    public String toString() {
        return s;
    }
}

public class Ex01 {
    String one, two, three, four;
    SimpleClass sc;
    Ex01(){
        System.out.println("This is the order first alphabetic letters, lol :");
        one = "A";
        two = "B";
        three = "C";

    }
    public String toString(){
        if(sc == null && four==null)
            sc = new SimpleClass();
            four = "D";
        return "one: " + one + " " +
                "two: " + two + " " +
                "three: " + three + " " +
                "four: " + four + " \n" +
                "Simple class " + sc;
    }

    public static void main(String[] args) {
        Ex01 obj = new Ex01();
        System.out.println(obj);
    }

}
