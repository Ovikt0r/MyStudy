package com.company.oviktor.booktasks.interfaces;

abstract class Base {
    protected int i = 3;
    abstract public void print();

    Base() {
        print();
    }

}

class Edge extends Base {

    @Override
    public void print() {
        System.out.println(i + " meters to the Edge left");
    }
}

class Apples extends Base {

    @Override
    public void print() {
        System.out.println(i + " apples left on the plate");
    }
}
public class Ex03 {


    public static void main(String[] args) {

        Apples apples = new Apples();
        apples.print();
        Edge edge = new Edge();
        edge.print();
    }

}
