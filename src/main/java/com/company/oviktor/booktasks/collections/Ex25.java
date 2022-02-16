package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex25 {


    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> wordCounter = new TreeMap<>();

        int i = 0;
        for (String word : new TextFile("text.txt", "\\W+")) {
            ArrayList<Integer> wordList = wordCounter.get(word);
            if (wordList == null) {
                wordList = new ArrayList<>();
                wordCounter.put(word, wordList);
            }
            wordList.add(++i);
        }
        ;
        log.info(wordCounter.toString());
    }
}
