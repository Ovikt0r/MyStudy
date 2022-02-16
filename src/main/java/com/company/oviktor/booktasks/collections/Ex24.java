package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Slf4j
public class Ex24 {

    public static void main(String[] args) {
        Map<String, String> persons = new LinkedHashMap<>();
        persons.put("Drinkwater", "Mike");
        persons.put("Stathem", "Entony");
        persons.put("Krupin", "Sergey");
        persons.put("Belluchhi", "Monika");
        persons.put("Darson", "Gregory");
        persons.put("Madison", "John");
        persons.put("Parker", "Sue");
        persons.put("Anderson", "Ken");
        persons.put("Bersen", "Den");
        persons.put("Kepchoge", "Eliut");
        persons.put("Visen", "Sin");
        persons.put("Ioan", "Vlas");

        SortedSet<String> keySet = new TreeSet<>(persons.keySet());
        Map<String, String> sortMap = new LinkedHashMap<>();

        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String keys = it.next();
            String value = persons.get(keys);
            sortMap.put(keys, value);
        }
        log.info(sortMap.toString());




    }
}
