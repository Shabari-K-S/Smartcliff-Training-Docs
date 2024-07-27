package com.self_practice;

import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Subasri", "Shabari" ,"Sathyaram", "Sowandharya" };
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}