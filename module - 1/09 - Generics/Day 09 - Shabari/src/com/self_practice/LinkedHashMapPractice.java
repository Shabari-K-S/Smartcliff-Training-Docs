package com.self_practice;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMapPractice {
    private LinkedHashMap<String, String> vehicleTypeMap = new LinkedHashMap<String, String>();

    public void addMappings(){
        vehicleTypeMap.put("car","sedan");
        vehicleTypeMap.put("truck","pickup");
        vehicleTypeMap.put("motorcycle","sportbike");
        vehicleTypeMap.put("van","minivan");
        vehicleTypeMap.put("suv","crossover");
    }

    public void copyMappings() {
        LinkedHashMap<String, String> copyMap = new LinkedHashMap<String, String>(vehicleTypeMap);
        System.out.println(copyMap);
    }

    public void retrieveValue(String key) {
        System.out.println(vehicleTypeMap.get(key));
    }

    public void removeMapping(String key) {
        vehicleTypeMap.remove(key);
    }

    public void checkKeyPresence(String key) {
        System.out.println(vehicleTypeMap.containsKey(key));
    }

    public void checkValuePresence(String value) {
        System.out.println(vehicleTypeMap.containsValue(value));
    }

    public boolean isEmpty(){
        return vehicleTypeMap.isEmpty();
    }

    public int size() {
        return vehicleTypeMap.size();
    }

    public void iterateEntries() {
        Iterator<Map.Entry<String, String>> iterator = vehicleTypeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void retrieveKeysAndValues() {
        System.out.println(vehicleTypeMap.keySet());
        System.out.println(vehicleTypeMap.values());
    }

    public static void main(String[] args) {
        LinkedHashMapPractice map = new LinkedHashMapPractice();
        map.addMappings();

        map.copyMappings();

        map.retrieveValue("motorcycle");

        map.removeMapping("van");

        map.checkKeyPresence("suv");
        map.checkValuePresence("pickup");

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.iterateEntries();

        map.retrieveKeysAndValues();
    }
}

