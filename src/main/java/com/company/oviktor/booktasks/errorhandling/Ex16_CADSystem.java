package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Shape {
    Shape(int i) { log.info("Shape constructor"); }
    void dispose() { log.info("Shape dispose"); }
}
@Slf4j
class Circle extends Shape {
    Circle(int i) {
        super(i);
        log.info("Drawing Circle");
    }
    void dispose() {
        log.info("Erasing Circle");
        super.dispose();
    }
}
@Slf4j
class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        log.info("Drawing Triangle");
    }
    void dispose() {
        log.info("Erasing Triangle");
        super.dispose();
    }
}
@Slf4j
class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        log.info("Drawing Line: " + start + ", " + end);
    }
    void dispose() {
        log.info("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
@Slf4j
public class Ex16_CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public Ex16_CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        log.info("Combined constructor");
    }
    public void dispose() {
        log.info("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization:
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Ex16_CADSystem x = new Ex16_CADSystem(47);
        try {
            log.info("------------------------------------------------------------------------------------");
            log.info("Performing from try block: ");
            return;
        } finally {
            x.dispose();
        }
    }
}