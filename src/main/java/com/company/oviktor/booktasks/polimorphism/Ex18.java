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

    public void balance() {
        System.out.println("Hold the balance");
    }
}

class Bicycle extends Cycle {

    public void ride() {
        System.out.println("Ride on bicycle");
    }

    public void balance() {
        System.out.println("Hold the balance");
    }
}

class Tricycle extends Cycle {

    public void ride() {
        System.out.println("Ride on trcycle");
    }
}

public class Ex18 {


    public static void main(String[] args) {

         Cycle[] cycles = new Cycle[] {new Unicycle(),
                          new Bicycle(),
                          new Tricycle()};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Unicycle)cycles[2]).balance();

    }
}
