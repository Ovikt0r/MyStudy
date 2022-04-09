package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square extends Shape {
    public void draw() { log.info("Square.draw()"); }
    public void erase() { log.info("Square.erase()"); }
}
