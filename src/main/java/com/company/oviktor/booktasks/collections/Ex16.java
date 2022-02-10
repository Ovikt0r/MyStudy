package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Ex16 {

    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u',
            'i', 'A', 'E', 'O', 'U', 'I'));
    private static final Map<Character, Integer> vowelAmount = new HashMap<>();

    public static void main(String[] args) {
        HashSet<String> processWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels;

        for (String word : new TextFile("text.txt", "\\W+")) {
            wordVowels = 0;
            for (char letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    wordVowels++;
                    vowelAmount.put(letter, !vowelAmount.containsKey(letter) ? 1 : vowelAmount.get(letter) + 1);
                }

            }
            if (!processWords.contains(word)) {
                processWords.add(word);
                log.info(word + " has " + wordVowels + " vowel(s)");
            }
            fileVowels += wordVowels;
        }
        log.info("Total number vowels in the file are " + fileVowels);
        log.info(vowelAmount.toString());
    }
}
