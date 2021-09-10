package com.company.oviktor.booktasks.polimorphism;

 class Cycle {

    public void ride() {
        System.out.println("Ride on cycle");
    }
}

class Unicycle extends Cycle {

    public void ride() {
        System.out.println("Ride on unicycle");
    }
}

class Bicycle extends Cycle {

    public void ride() {
        System.out.println("Ride on bicycle");
    }
}

class Tricycle extends Cycle {

    public void ride() {
        System.out.println("Ride on trcycle");
    }
}

public class Ex01 {

     public static void move(Cycle c) {
         c.ride();
     }

    public static void main(String[] args) {

         Cycle cycle = new Cycle();
         Unicycle unicycle = new Unicycle();
         Bicycle bicycle = new Bicycle();
         Tricycle tricycle = new Tricycle();

         move(cycle);
         move(unicycle);
         move(bicycle);
         move(tricycle);
    }
}
