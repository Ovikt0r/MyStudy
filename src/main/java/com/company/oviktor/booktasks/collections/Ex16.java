package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex16 {

    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u',
            'i', 'A', 'E', 'O', 'U', 'I'));
    private static final Map<Character, Integer> vowelAmount = new TreeMap<>();
    private static final Map<Character, Integer> fileAmount = new TreeMap<>();

    public static void updateStat(Map<Character, Integer> map, char ch) {
        Integer i = map.get(ch);
        map.put(ch, i == null ? 1 : i+1);
    }


    public static void main(String[] args) {
        HashSet<String> processWords = new HashSet<>();

        for (String word : new TextFile("text.txt", "\\W+")) {
            vowelAmount.clear();
            for (char letter : word.toCharArray())
                if (vowels.contains(letter)) {
                    updateStat(vowelAmount, letter);
                    updateStat(fileAmount, letter);
                }
            if (!processWords.contains(word)) {
                processWords.add(word);
                log.info("Vowel(s) in " + word + " : " + vowelAmount);
            }
        }

        log.info(fileAmount.toString());
    }
}
