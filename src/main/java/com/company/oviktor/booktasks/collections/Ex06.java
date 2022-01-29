package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex06 {

    public static void main(String[] args) {
        Random rand = new Random(48);
        List<String> strngs = new ArrayList<>(Arrays.asList("lol", "kek", "mook", "dur", "6","4ek" ,"shock"));
        log.info("1: " + strngs);
        strngs.add("gik");
        log.info("2: " + strngs);
        log.info("3: " + strngs.contains("kek"));
        strngs.remove("lol");
        String i = strngs.get(3);
        log.info("4: " + i + " " + strngs.indexOf(i));
        String j = "kek";
        log.info("5: " + strngs.indexOf(j));
        log.info("6: " + strngs.remove(j));
        log.info("7: " + strngs.remove(i));
        log.info("8: " + strngs);
        strngs.add(5, "bil");
        log.info("9: " + strngs);
        List<String> sub = strngs.subList(0, 3);
        log.info("Sublist: " + sub);
        log.info("10: " + strngs.containsAll(sub));
        Collections.sort(sub);
        log.info("sort sublist: " + sub);
        log.info("11: " + strngs.containsAll(sub));
        Collections.shuffle(sub, rand);
        log.info("Post shuffle sublist: " + sub);
        log.info("12: " + strngs.containsAll(sub));
        List<String> copyStrings = new ArrayList<>(strngs);
        sub = Arrays.asList(strngs.get(1), strngs.get(4));
        log.info(String.valueOf(sub));
        copyStrings.retainAll(sub);
        log.info("13: " + copyStrings);
        copyStrings = new ArrayList<>(strngs);
        copyStrings.remove(2);
        log.info("14: " + copyStrings);
        copyStrings.removeAll(sub);
        log.info("15: " + copyStrings);
        copyStrings.set(2, "god");
        log.info("16: " + copyStrings);
        copyStrings.addAll(2, sub);
        log.info("17: " + copyStrings);
        log.info("18: " + strngs.isEmpty());
        strngs.clear();
        log.info("19: " + strngs);
        log.info("20: " + strngs.isEmpty());
        strngs.addAll(Arrays.asList("dik","sil","led","dog"));
        log.info("21: " + strngs);
        Object[] o = strngs.toArray();
        log.info("22: " + o[2]);
        String[] ia = strngs.toArray(new String[0]);
        log.info("23: " + ia[3]);
    }
}
