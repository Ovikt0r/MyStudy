package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
class Counter {
    int i = 1;

    public String toString() {
        return Integer.toString(i);
    }
}

@Slf4j
class HistoUnit implements Comparable<HistoUnit> {
    Counter counter;
    Integer val;

    public HistoUnit(Counter counter, Integer val) {
        this.counter = counter;
        this.val = val;
    }

    public int compareTo(HistoUnit o) {
        int lv = o.counter.i;
        int rv = counter.i;
        return (Integer.compare(lv, rv));
    }

    public String toString() {
        return "Value = " + val + ", Occurrences = " + counter.i + "\n";
    }
}

@Slf4j
public class Ex23_Statics {
    public static void main(String[] args) {

        Random rand = new Random(47);
        Map<Integer, Counter> m = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            int n = rand.nextInt(100);
            if (m.containsKey(n)) {
                m.get(n).i++;
            } else
                m.put(n, new Counter());
        }

        List<HistoUnit> lst = new ArrayList<>();
        Iterator<Map.Entry<Integer, Counter>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Counter> entry = it.next();
            lst.add(new HistoUnit(entry.getValue(), entry.getKey()));
        }
        Collections.sort(lst);

        log.info("List = " + lst);
    }

}


