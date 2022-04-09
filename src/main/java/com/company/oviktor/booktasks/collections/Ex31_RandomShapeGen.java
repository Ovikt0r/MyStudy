package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex31_RandomShapeGen implements Iterable<Shape> {
    Random random = new Random(47);
    int count;

    Ex31_RandomShapeGen(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public Shape next() {
                index++;
                return nextShape();
            }
        };
    }


    private Shape nextShape() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        Ex31_RandomShapeGen randomShapeGen = new Ex31_RandomShapeGen(10);
        for (Shape s : randomShapeGen) {
            s.draw();
            s.erase();

        }
    }
}