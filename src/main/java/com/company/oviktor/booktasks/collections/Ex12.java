package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex12 {
    public static void main(String[] args) {


    List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1,3,5,78,4,32,23,5,7564,3,12,35));

    List<Integer> reversList = new ArrayList<>();

    ListIterator<Integer> revList = integerList1.listIterator(integerList1.size()/2);

    while (revList.hasPrevious()) {
        Integer o = revList.previous();
        reversList.add(o);
    }
        log.info(reversList.toString());
    }
}

