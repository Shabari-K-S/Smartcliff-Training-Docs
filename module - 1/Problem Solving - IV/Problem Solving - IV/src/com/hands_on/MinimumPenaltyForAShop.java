package com.hands_on;

import java.util.Scanner;

public class MinimumPenaltyForAShop {
    public static int convertStringToInt(String str){
        String numStr = str.replace('Y', '1').replace('N','0');
        return Integer.parseInt(numStr, 2);

    }

    public static String minimumPenaltyForAShop(int n) {
        int ans = 0;
        while(n>0){
            ans ^= n;
            n >>= 1;
        }

        return Integer.toBinaryString(ans);
    }

    public static int sum(String val) {
        int cnt = 0;
        for(char ch: val.toCharArray()){
            if (ch == '1')
                cnt++;
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The Minimum Penalty for a Shop: ");
        int num = convertStringToInt(str);
        String val = minimumPenaltyForAShop(num);
        System.out.println(sum(val));
    }
}
