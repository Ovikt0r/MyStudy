package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Ex16 {

    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u',
            'i', 'A', 'E', 'O', 'U', 'I'));

    public static void main(String[] args) {
        HashSet<String> procWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels;

        for (String word : new TextFile("text.txt", "\\W+")) {
            wordVowels = 0;
            for (char letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    wordVowels++;
                }
            }
            if (!procWords.contains(word)) {
                procWords.add(word);
                log.info(word + " has " + wordVowels + " vowel(s)");
            }
            fileVowels += wordVowels;
        }
        log.info("Total number vowels in the file are " + fileVowels);
    }
}
