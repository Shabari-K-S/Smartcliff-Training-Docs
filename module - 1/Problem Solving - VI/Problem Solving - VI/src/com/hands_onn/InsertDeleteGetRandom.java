package com.hands_onn;

import java.util.*;

class RandomizedSet {
    Set<Integer> vals = new HashSet<>();
    private final Random rand = new Random();


    public boolean insert(int val) {
        return vals.add(val);
    }

    public boolean remove(int val) {
        return vals.remove(val);
    }

    public Object getRandom() {
        final int index = rand.nextInt(vals.size());
        Object[] value = vals.toArray();
        return value[index];
    }


}

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valToIndex = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String key = sc.next();
            vals.add(key);
        }

        for (int i = 0; i < size; i++){
            int val = sc.nextInt();
            valToIndex.add(val);
        }
        RandomizedSet obj = new RandomizedSet();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < vals.size(); i++) {
            switch (vals.get(i)){
                case "object":
                    ans.add(null);
                    break;

                case "insert":
                    if (obj.insert(valToIndex.get(i)))
                        ans.add("true");
                    else
                        ans.add("false");
                    break;
                case "remove":
                    if (obj.remove(valToIndex.get(i)))
                        ans.add("true");
                    else
                        ans.add("false");
                    break;
                case "getrandom":
                    ans.add(obj.getRandom().toString());
                    break;
                default:
                    ans.add("invalid input");

            }
        }
        System.out.println("Final Output: "+ans);
    }
}
