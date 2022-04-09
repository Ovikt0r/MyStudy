package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle extends Shape {
    public void draw() { log.info("Triangle.draw()"); }
    public void erase() { log.info("Triangle.erase()"); }
}