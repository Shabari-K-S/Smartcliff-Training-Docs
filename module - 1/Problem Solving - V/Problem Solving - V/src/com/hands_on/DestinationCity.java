package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class DestinationCity {
    public static String destCity(String[][] paths) {
        HashMap<String, String> map = new HashMap<>();
        for(String[] path: paths){
            map.put(path[0], path[1]);
        }
        String city = paths[0][0];
        while(map.containsKey(city)){
            city = map.get(city);
        }
        return city;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of paths: ");
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
        System.out.println("Enter the paths: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.next();
            }
        }

        System.out.println("The destination city: " + destCity(arr));
    }
}