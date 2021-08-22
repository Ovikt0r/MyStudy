package com.company.oviktor.booktasks.reusingclasses;

class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service(){
        System.out.println("It's service time");
    }
}
class ServicableEngine extends Engine {
    public void service(){
        super.service();
    }
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class Ex14_Car {
    public ServicableEngine serviceableEngine = new ServicableEngine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // 2-door
    public Ex14_Car() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args) {
        Ex14_Car car = new Ex14_Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.serviceableEngine.service();
    }
}