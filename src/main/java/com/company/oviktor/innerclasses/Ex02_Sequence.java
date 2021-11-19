package com.company.oviktor.innerclasses;

class StringHolder {
    private String data;

    StringHolder(String data) {
        this.data = data;
    }
    public String toString(){
        return data;
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Ex02_Sequence {
    private Object[] items;
    private int next = 0;
    public Ex02_Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Ex02_Sequence sequence = new Ex02_Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(new StringHolder(Integer.toString(i)));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        StringHolder sh1 = new StringHolder("First string");
        StringHolder sh2 = new StringHolder("Second string");
        StringHolder sh3 = new StringHolder("Third string");

        Ex02_Sequence message = new Ex02_Sequence(3);
        message.add(sh1);
        message.add(sh2);
        message.add(sh3);

        Selector selector1 = message.selector();
        while (!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}