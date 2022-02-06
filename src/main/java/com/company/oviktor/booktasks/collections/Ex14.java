package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@Slf4j
public class Ex14 {

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < 10; i++) {
            int j = a[i];
            ListIterator<Integer> it = integerList.listIterator(integerList.size()/2);
            it.add(j);

        }
        log.info(integerList.toString());
    }
}
