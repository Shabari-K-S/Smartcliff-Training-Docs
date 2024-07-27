package com.hands_on;

import java.util.Scanner;

public class MinimumNumberofFrogsCroaking {
    public static int minimumNumberofFrogsCroaking(String str) {
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int res = 0;
        for(char ch: str.toCharArray()){
            if (ch == 'c'){
                c++;
                res = Math.max(res, c);
            }else if (ch == 'r'){
                r++;
            }else if (ch == 'o'){
                o++;
            }else if (ch == 'a'){
                a++;
            }else if (ch == 'k'){
                k++;
                if (c < r || r < o || o < a || a < k){
                    return -1;
                }
            }
        }
        if (c == r && r == o && o == a && a == k){
            return res;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(minimumNumberofFrogsCroaking(str));
    }
}