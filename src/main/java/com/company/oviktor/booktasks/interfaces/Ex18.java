package com.company.oviktor.booktasks.interfaces;

class Unicycle implements Cycle {
    public int wheels() {
        return 1;
    }
}

class UnicycleFactory implements CycleFactory {
    public Unicycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public int wheels() {
        return 2;
    }
}

class BicycleFactory implements CycleFactory {
    public Bicycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public int wheels() {
        return 3;
    }
}

class TricycleFactory implements CycleFactory {
    public Tricycle getCycle() {
        return new Tricycle();
    }
}

public class Ex18 {

    public static void goCycling(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        System.out.println("Numbers of wheels: " + c.wheels());
    }
    public static void main(String[] args) {

        goCycling(new UnicycleFactory());
        goCycling(new BicycleFactory());
        goCycling(new TricycleFactory());
    }
}
