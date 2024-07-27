package com.self_practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    private LinkedHashSet<String> wordSet = new LinkedHashSet<String>();

    public void addWords() {
        wordSet.add("dog");
        wordSet.add("cat");
        wordSet.add("bird");
        wordSet.add("fish");
        wordSet.add("rabbit");
        wordSet.add("turtle");
    }

    public void addWord(String word) {
        wordSet.add(word);
    }

    public void removeWord(String word) {
        wordSet.remove(word);
    }

    public boolean containsWord(String word) {
        return wordSet.contains(word);
    }

    public boolean isEmpty() {
        return wordSet.isEmpty();
    }

    public int size() {
        return wordSet.size();
    }

    public void iterateWords() {
        Iterator<String> iterator = wordSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void convertToArray() {
        String[] words = wordSet.toArray(new String[0]);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void printHashCode() {
        System.out.println(wordSet.hashCode());
    }

    public void clearWords() {
        wordSet.clear();
    }

    public static void main(String[] args) {
        LinkedHashSetPractice set = new LinkedHashSetPractice();
        set.addWords();

        set.addWord("horse");

        set.removeWord("bird");

        System.out.println(set.containsWord("fish"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.iterateWords();
        set.convertToArray();
        set.printHashCode();

        set.clearWords();
    }
}