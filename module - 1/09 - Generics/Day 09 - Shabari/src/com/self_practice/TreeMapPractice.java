package com.self_practice;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    private TreeMap<String, Integer> studentMap = new TreeMap<String, Integer>();

    public void addEntries() {
        studentMap.put("Alice", 20);
        studentMap.put("Bob", 22);
        studentMap.put("Charlie", 18);
        studentMap.put("David", 25);
        studentMap.put("Eva", 21);
    }

    public void removeEntry(String key) {
        studentMap.remove(key);
    }

    public boolean containsKey(String key) {
        return studentMap.containsKey(key);
    }

    public boolean isEmpty() {
        return studentMap.isEmpty();
    }

    public int size() {
        return studentMap.size();
    }

    public void iterateEntries() {
        Iterator<Map.Entry<String, Integer>> iterator = studentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void retrieveMaxEntry() {
        Map.Entry<String, Integer> maxEntry = studentMap.lastEntry();
        System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());
    }

    public void retrieveMinEntry() {
        Map.Entry<String, Integer> minEntry = studentMap.firstEntry();
        System.out.println(minEntry.getKey() + " : " + minEntry.getValue());
    }

    public void pollFirstAndLast() {
        Map.Entry<String, Integer> firstEntry = studentMap.pollFirstEntry();
        Map.Entry<String, Integer> lastEntry = studentMap.pollLastEntry();
        System.out.println(firstEntry.getKey() + " : " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " : " + lastEntry.getValue());
    }

    public static void main(String[] args) {
        TreeMapPractice map = new TreeMapPractice();
        map.addEntries();

        map.removeEntry("Charlie");

        System.out.println(map.containsKey("Bob"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.iterateEntries();

        map.retrieveMaxEntry();
        map.retrieveMinEntry();

        map.pollFirstAndLast();
    }
}