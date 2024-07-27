package com.handson;

import java.util.*;

public class SpecialEvents {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of string : ");
        int n=sc.nextInt();
        System.out.print("Enter strings : ");
        String s[]=new String[n];
        for(int i=0;i<n;i++) {
          s[i] = sc.nextLine();
        }
        HashSet<String> h=new HashSet<>();
        for(String str:s){
            int[] odd=new int[26];
            int [] even=new int[26];
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    even[str.charAt(i)-'a']++;
                }else{
                    odd[str.charAt(i)-'a']++;
                }}
                String key=Arrays.toString(odd)+Arrays.toString(even);
                h.add(key);
            
        }
        System.out.print(h.size());
	}
}
