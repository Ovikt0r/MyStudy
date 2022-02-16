package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex23_2_Statics {
    private static int getBestInt100(int x) {

        Random random = new Random();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq);
        }
        int max = 0;
        for (int i = 0; i < map.keySet().size(); i++) {
            max = max < map.get(i) ? map.get(i) : max;
        }
        Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<Map.Entry<Integer, Integer>>(map.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> findMax = it.next();
            if (findMax.getValue() == max)
                maxKey = findMax.getKey();
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map100 = new TreeMap<>();
        for (int i = 0; i < 2000; i++) {
            int a = getBestInt100(10000);
            Integer freq = map100.get(a);
            map100.put(a, freq == null ? 1 : freq +1);
        }
        log.info("Most often picked ints, 0 - 99, in 2000 tests of 10,000 random picks: " + map100);
    }

}
