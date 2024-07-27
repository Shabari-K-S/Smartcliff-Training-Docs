package com.handson;

import java.util.*;

public class CustomSort {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String order = sc.nextLine();
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                ans.append((c+"").repeat(count));
                map.remove(c);
            }
        }
        for(char ch : map.keySet()){
            int count = map.get(ch);
            ans.append((ch+"").repeat(count));
        }

        System.out.print(ans.toString());
        sc.close();
	}
}
