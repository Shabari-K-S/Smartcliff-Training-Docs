package com.self_practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    private HashSet<String> stringSet = new HashSet<String>();

    public void addStrings() {
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");
        stringSet.add("grape");
    }

    public void addAllFromCollection(HashSet<String> additionalSet) {
        stringSet.addAll(additionalSet);
    }

    public void removeString(String string) {
        stringSet.remove(string);
    }

    public void removeAll() {
        stringSet.clear();
    }

    public void removeAllFromCollection(HashSet<String> removalSet) {
        stringSet.removeAll(removalSet);
    }

    public boolean containsString(String string) {
        return stringSet.contains(string);
    }

    public int size() {
        return stringSet.size();
    }

    public boolean isEmpty() {
        return stringSet.isEmpty();
    }

    public void iterateStrings() {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void convertToArray() {
        String[] strings = stringSet.toArray(new String[0]);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void retainElements(HashSet<String> retainSet) {
        stringSet.retainAll(retainSet);
    }

    public static void main(String[] args) {
        HashSetPractice set = new HashSetPractice();
        set.addStrings();

        HashSet<String> additionalSet = new HashSet<String>();
        additionalSet.add("mango");
        additionalSet.add("kiwi");

        set.addAllFromCollection(additionalSet);

        set.removeString("banana");

        set.removeAll();

        HashSet<String> removalSet = new HashSet<String>();
        removalSet.add("orange");
        removalSet.add("grape");

        set.removeAllFromCollection(removalSet);

        System.out.println(set.containsString("orange"));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.addStrings();

        set.iterateStrings();
        set.convertToArray();

        HashSet<String> retainSet = new HashSet<String>();
        retainSet.add("apple");
        retainSet.add("banana");

        set.retainElements(retainSet);

        set.iterateStrings();
    }
}