package com.company.oviktor.booktasks.collections;

import java.util.ArrayList;
import java.util.List;

public class Ex03_Sequence {
    private final List<Object> items = new ArrayList<>();

    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Ex03_Sequence sequence = new Ex03_Sequence();
        for(int i = 1; i <= 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}