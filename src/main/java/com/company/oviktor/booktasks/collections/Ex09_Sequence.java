package com.company.oviktor.booktasks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09_Sequence {
    private final List<Object> items = new ArrayList<>();

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {return items.iterator();}

    public static void main(String[] args) {
        Ex09_Sequence sequence = new Ex09_Sequence();
        for(int i = 1; i <= 10; i++) {
            sequence.add(Integer.toString(i));
        }
         Iterator it = sequence.iterator();
        while (it.hasNext()) {
        }
    }
}