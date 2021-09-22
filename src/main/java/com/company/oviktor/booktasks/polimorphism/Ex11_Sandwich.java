package com.company.oviktor.booktasks.polimorphism;

class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

class Pickle extends PortableLunch {
    Pickle() {System.out.println("This portable lunch has some pickle");}
}

public class Ex11_Sandwich extends Pickle {
    private final Bread b = new Bread();
    private final Cheese c = new Cheese();
    private final Lettuce l = new Lettuce();
    public Ex11_Sandwich() { System.out.println("Sandwich()"); }

    public static void main(String[] args) {
        new Ex11_Sandwich();
    }
}