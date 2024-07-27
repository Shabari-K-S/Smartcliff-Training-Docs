package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithEqual0s1sand2s {

    // Referred method -> working
    public static int arraysWithEqual012(int[] arr, int n){
        if (n < 3)
            return 0;
        int ans = 0;
        int c0 = 0, c1 = 0, c2 = 0;
        String key = 0 + "#" + 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put(key, 1);
        for(int num : arr){
            if(num == 0)
                c0++;
            else if(num == 1)
                c1++;
            else
                c2++;
            key = (c2-c1) + "#" + (c1-c0);
            if(map.containsKey(key)){
                ans += map.get(key);
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
        return ans;
    }

    // my method -> not working
    public static int subarraysWithEqual012(int[] arr, int n){
        int cnt = 0;
        int flag = 0;
        for(int i=0;i<n-2;i++){
            int c = 0;

            for(int j=i; j < i+3; j++){
                if (arr[j] == 1) {
                    flag = 1;
                    c++;
                }
                else if (arr[j] == 2) {
                    flag = 1;
                    c+=2;
                }
                else if (arr[j] == 0) {
                    flag = 1;
                    c+=3;
                }

            }
            if (flag == 1 && c == 6 ){
                cnt++;
            }
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arraysWithEqual012(arr, n));
    }
}
