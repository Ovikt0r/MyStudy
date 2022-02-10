package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex20 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("UKRAINE");
        set.add("USA");
        set.add("UK");
        set.add("FRANCE");
        set.add("SPAIN");
        set.add("GREECE");
        set.add("GERMAN");
        set.add("NORWAY");
        log.info(set.toString());
        String[] countries = set.toArray(new String[0]);
        Arrays.sort(countries);
        Set<String> set2 = new LinkedHashSet<>();
        Collections.addAll(set2, countries);
        log.info(set2.toString());
    }
}
