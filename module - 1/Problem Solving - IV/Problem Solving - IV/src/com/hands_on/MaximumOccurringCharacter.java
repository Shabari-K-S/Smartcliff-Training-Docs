package com.hands_on;

import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static char maximumOccurringCharacter(String str) {
        int max = -1;

        for (int i = 0; i < str.length(); i++){
            int cnt = 0;
            for(int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    cnt++;
                }
            }
            if ((max < cnt ) || ((max <= cnt ) &&(str.charAt((max == -1)? 0: max) > str.charAt(cnt)))){
                max =i;
            }
        }

        if (max == -1 )
            return str.charAt(0);
        return str.charAt(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("The maximum occurring character is "+ maximumOccurringCharacter(str));
    }
}
