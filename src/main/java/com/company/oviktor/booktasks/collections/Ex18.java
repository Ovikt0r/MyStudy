package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex18 {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("UKRAINE", "Kyiv");
        hashMap.put("USA", "Washington");
        hashMap.put("UK", "London");
        hashMap.put("FRANCE", "Paris");
        hashMap.put("SPAIN", "Madrid");
        hashMap.put("GREECE", "Athene");
        hashMap.put("GERMAN", "Berlin");
        hashMap.put("NORWAY", "Oslo");
        log.info(hashMap.toString());

        Set<String> stringSet = new TreeSet<>(hashMap.keySet());
        log.info(stringSet.toString());

        Map<String, String> hashMap2 = new LinkedHashMap<>();
        for (String s : stringSet) {
            hashMap2.put(s, hashMap.get(s));
        }
        log.info(hashMap2.toString());
    }
}
