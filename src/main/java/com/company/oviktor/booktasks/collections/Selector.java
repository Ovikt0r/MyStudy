package com.company.oviktor.booktasks.collections;

interface Selector {
    boolean end();
    Object current();
    void next();
}