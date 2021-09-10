package com.company.oviktor.booktasks.polimorphism;

import java.util.Random;

class Shape {
    public void draw() {}
    public void erase() {}
    public void text() {
        System.out.println("Type some text on the shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing circle");
    }
    @Override
    public void text() {
        System.out.println("Type some text on the circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
    @Override
    public void erase() {
        System.out.println("Erasing square");
    }
    @Override
    public void text() { System.out.println("Type some text on the square");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing square");
    }
    @Override
    public void text() { System.out.println("Type some text on the triangle");
    }
}
class Dodecahedron extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing dodecahedron");
    }
    @Override
    public void erase() {
        System.out.println("Erasing dodecahedron");
    }
    @Override
    public void text() { System.out.println("Type some text on the dodecahedron");
    }
}

class RandomShapeGenerator {
    private final Random random = new Random(54);

    public Shape next(){
        switch (random.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Dodecahedron();
        }
    }
}

public class Ex04 {
    private static final RandomShapeGenerator rsg = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for(int i = 0; i < shapes.length; i++) {
            shapes[i] = rsg.next();
        }
        for(Shape shp : shapes) {
            shp.draw();
            shp.erase();
            shp.text();
        }
    }
}
