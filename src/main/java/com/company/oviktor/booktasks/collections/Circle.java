package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle extends Shape {
    public void draw() { log.info("Circle.draw()"); }
    public void erase() { log.info("Circle.erase()"); }
}