package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex02 {

    public static void main(String[] args) {
        Collection<Integer> collection = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            collection.add(i);
        }
        for(Integer i : collection) {
            log.info(String.valueOf(i));
        }

    }
}
