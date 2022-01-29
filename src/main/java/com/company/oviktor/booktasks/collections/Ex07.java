package com.company.oviktor.booktasks.collections;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ItemNames {
    private static int counter;
    private final int id = counter++;

    public String toString() {
        return "ItemNames number " + id;
    }
}
@Slf4j
public class Ex07 {
    public static void main(String[] args) {
        ItemNames[] names = new ItemNames[10];
        for (int i = 0; i < names.length; i++)
            names[i] = new ItemNames();
        List<ItemNames> nameList = new ArrayList<>();
        Collections.addAll(nameList, names);
        log.info("List = " + nameList);
        List<ItemNames> subNameList = nameList.subList(2,5);
        log.info("Sublist = " + subNameList);
        subNameList.clear();
        log.info("List = " + nameList);

    }
}
