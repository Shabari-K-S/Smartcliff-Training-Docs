package com.self_practice;

import javax.swing.*;
import java.util.HashMap;
import  java.util.Iterator;
import java.util.Map;

public class HashMapPractice {
    private HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

    public void addMappings() {
        wordCountMap.put("apple", 5);
        wordCountMap.put("banana", 8);
        wordCountMap.put("cherry", 3);
        wordCountMap.put("date", 6);
        wordCountMap.put("grape", 4);
    }

    public void copyMappings() {
        HashMap<String, Integer> copyMap = new HashMap<String, Integer>(wordCountMap);
        System.out.println(copyMap);
    }

    public void retrieveValue(String key) {
        System.out.println(wordCountMap.get(key));
    }

    public void removeMapping(String key) {
        wordCountMap.remove(key);
    }

    public void checkKeyPresence(String key) {
        System.out.println(wordCountMap.containsKey(key));
    }

    public void checkValuePresence(int value) {
        System.out.println(wordCountMap.containsValue(value));
    }

    public boolean isEmpty() {
        return wordCountMap.isEmpty();
    }

    public int size() {
        return wordCountMap.size();
    }

    public void iterateEntries() {
        Iterator<Map.Entry<String, Integer>> iterator = wordCountMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void retrieveKeysAndValues() {
        System.out.println(wordCountMap.keySet());
        System.out.println(wordCountMap.values());
    }

    public static void main(String[] args) {
        HashMapPractice map = new HashMapPractice();
        map.addMappings();

        map.copyMappings();

        map.retrieveValue("date");

        map.removeMapping("cherry");

        map.checkKeyPresence("banana");
        map.checkValuePresence(4);

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.iterateEntries();

        map.retrieveKeysAndValues();
    }

}

