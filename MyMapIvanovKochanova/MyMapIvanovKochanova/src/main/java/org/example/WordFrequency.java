package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> countWordFrequency(String sentence) {
    Map<String,Integer> wordCountMap = new HashMap<>();
    if(sentence == null || sentence.isEmpty()){
        return wordCountMap;
    }
    String[] words = sentence.toLowerCase().split("\\W");
    for(String word: words){
        if(!word.isEmpty()){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }
    return wordCountMap;
    }
}
