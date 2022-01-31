package com.company.oviktor.booktasks.collections;


import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex11 {

    public static void printSomeCol(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            log.info(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(5, 7, 3, 2, 1));
        LinkedList<Character> characters = new LinkedList<>(Arrays.asList('a', 't', 'p', 'x'));
        HashSet<Long> longs = new HashSet<>(Arrays.asList(5L, 3L, 1L, 5L, 8L, 7L));
        TreeSet<Double> doubles = new TreeSet<>(Arrays.asList(4.54, 1.43, 6.78, 5.32));
        LinkedHashSet<Float> floats = new LinkedHashSet<>(Arrays.asList(6.65f, 3.1f, 7.23f, 2.12f));

        printSomeCol(integers);
        printSomeCol(characters);
        printSomeCol(longs);
        printSomeCol(doubles);
        printSomeCol(floats);
    }


}
