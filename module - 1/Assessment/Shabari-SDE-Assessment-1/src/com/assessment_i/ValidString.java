package com.assessment_i;

import java.util.Scanner;

public class ValidString {
    private static void validString(String[] arr){
        for(String s: arr){
            if (isValidString(s)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    private static boolean isValidString(String str){
        int low = 0, high = 0;
        for (char c: str.toCharArray()){
            low += c == '(' ? 1 : -1;
            high += c != ')' ? 1 : -1;
            if (high < 0) break;
            low = Math.max(low, 0);
        }
        return low == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        validString(arr);
    }
}
