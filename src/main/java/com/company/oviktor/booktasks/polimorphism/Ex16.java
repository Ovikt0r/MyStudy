package com.company.oviktor.booktasks.polimorphism;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw");
    }
    Glyph() {
        System.out.println("Glyph() before invoking draw()");
        draw();
        System.out.println("Glyph after invoking draw()");
    }
}

class RoundGlyph extends Glyph {
    private final int radius;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private final int weight;
    private final int height;

    RectangularGlyph (int weight, int height) {
        this.height = height;
        this.weight = weight;

        System.out.println("RectangularGlyph.RectangularGlyph(), weight = " + weight + ", height " + height);
    }
    public void draw() {
        System.out.println("RectangularGlyph.draw(), area = " + height * weight);
    }
}
public class Ex16 {

    public static void main(String[] args) {
        new RoundGlyph(6);
        new RectangularGlyph(4, 5);
        new RectangularGlyph(4, 5).draw();
    }
}
