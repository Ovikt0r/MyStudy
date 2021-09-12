package com.company.oviktor.booktasks.polimorphism;

 class Cycle {

    public int wheels() {return 0;}

}

class Unicycle extends Cycle {


    public int wheels(){return 1;}
}

class Bicycle extends Cycle {


    public int wheels(){return 2;}
}

class Tricycle extends Cycle {

    public int wheels(){return 3;}
}

public class Ex05 {

     public static void ride (Cycle c) {
         System.out.println("Num of wheels are: " + c.wheels());
     }

    public static void main(String[] args) {

         Cycle cycle = new Cycle();
         Unicycle unicycle = new Unicycle();
         Bicycle bicycle = new Bicycle();
         Tricycle tricycle = new Tricycle();

         ride(cycle);
         ride(unicycle);
         ride(bicycle);
         ride(tricycle);
    }
}
