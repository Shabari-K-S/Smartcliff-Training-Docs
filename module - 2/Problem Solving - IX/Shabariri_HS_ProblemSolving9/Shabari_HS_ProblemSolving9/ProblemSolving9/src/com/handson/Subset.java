package com.handson;
import java.util.*;
public class Subset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter n2: ");
       int n2 = sc.nextInt();
       System.out.println("Enter array :");
       int b[] = new int[n2];
       for (int i = 0; i < n2; i++) {
           b[i] = sc.nextInt();
       }
       Map<Integer,Integer> count = new HashMap<Integer,Integer>();
       for(int i : a) {
       	count.put(0,count.getOrDefault(0, i)+1);
       }
       int c = 0;
       boolean flag = true;
       for(int i : b) {
       	if (!count.containsKey(i) || count.get(i) == 0) {
               flag = false;
               break;
           } else {
               count.put(i, count.get(i) - 1);
           }
       }
       if(flag)
       	System.out.println("No");
       else
       	System.out.println("Yes");
	}
}
