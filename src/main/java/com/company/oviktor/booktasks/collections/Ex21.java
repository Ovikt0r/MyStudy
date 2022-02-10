package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex21 {


    private static final Map<String, Integer> wordAmount = new TreeMap<>();

    public static void updateStat(Map<String, Integer> map, String str) {
        Integer i = map.get(str);
        map.put(str, i == null ? 1 : i + 1);
    }


    public static void main(String[] args) {


        for (String word : new TextFile("text.txt", "\\W+")) {
            updateStat(wordAmount, word);
        }
        List<String> wordList = new LinkedList<>(wordAmount.keySet());
        wordList.sort(String.CASE_INSENSITIVE_ORDER);
        for (String s : wordList)
            log.info(s + " ---> " + wordAmount.get(s));
    }

}

