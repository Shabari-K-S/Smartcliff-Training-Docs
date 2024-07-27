package com.hands_onn;

import java.util.ArrayList;
import java.util.Scanner;

class SeatManager{
    int[] arr;
    int count = 0;
    SeatManager(int n){
        arr = new int[n];
        for (int i = 0; i < n; i++ ) {
            arr[i] = 0;
        }
    }

    public int reserve() {
        if (count < arr.length)
            arr[count++] = 1;
        return count;
    }

    public void unreserve(int n) {
        count--;
        arr[n] = 0;
    }
}

public class SeatReservationManager {
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

        SeatManager obj = new SeatManager(10);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < vals.size(); i++) {
            switch (vals.get(i)){
                case "object":
                    ans.add(null);
                    break;

                case "reserve":
                    ans.add(Integer.toString(obj.reserve()));
                    break;
                case "unreserve":
                    obj.unreserve(valToIndex.get(i));
                    ans.add(null);
                    break;
                default:
                    ans.add("invalid input");

            }
        }
        System.out.println("Final Output: "+ans);
    }

}
