package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = sentence.split("[^a-zA-Z]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                String lowercaseWord = word.toLowerCase();

                wordMap.put(lowercaseWord, wordMap.getOrDefault(lowercaseWord, 0) + 1);
            }
        }
        return wordMap;
    }
}
