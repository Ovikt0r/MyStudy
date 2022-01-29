package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex05 {

    public static void main(String[] args) {
        Random rand = new Random(48);
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 6, 8, 33, 13, 19));
        log.info("1: " + integers);
        integers.add(17);
        log.info("2: " + integers);
        log.info("3: " + integers.contains(4));
        integers.remove(Integer.valueOf(8));
        Integer i = integers.get(3);
        log.info("4: " + i + " " + integers.indexOf(i));
        Integer j = Integer.valueOf(19);
        log.info("5: " + integers.indexOf(j));
        log.info("6: " + integers.remove(j));
        log.info("7: " + integers.remove(i));
        log.info("8: " + integers);
        integers.add(5, 22);
        log.info("9: " + integers);
        List<Integer> sub = integers.subList(2, 7);
        log.info("Sublist: " + sub);
        log.info("10: " + integers.containsAll(sub));
        Collections.sort(sub);
        log.info("sort sublist: " + sub);
        log.info("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, rand);
        log.info("Post shuffle sublist: " + sub);
        log.info("12: " + integers.containsAll(sub));
        List<Integer> copyIntegers = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(2), integers.get(6));
        log.info(String.valueOf(sub));
        copyIntegers.retainAll(sub);
        log.info("13: " + copyIntegers);
        copyIntegers = new ArrayList<>(integers);
        copyIntegers.remove(2);
        log.info("14: " + copyIntegers);
        copyIntegers.removeAll(sub);
        log.info("15: " + copyIntegers);
        copyIntegers.set(2, 77);
        log.info("16: " + copyIntegers);
        copyIntegers.addAll(2, sub);
        log.info("17: " + copyIntegers);
        log.info("18: " + integers.isEmpty());
        integers.clear();
        log.info("19: " + integers);
        log.info("20: " + integers.isEmpty());
        integers.addAll(Arrays.asList(4,3,2,1));
        log.info("21: " + integers);
        Object[] o = integers.toArray();
        log.info("22: " + o[0]);
        Integer[] ia = integers.toArray(new Integer[1]);
        log.info("23: " + ia[3]);



    }
}
