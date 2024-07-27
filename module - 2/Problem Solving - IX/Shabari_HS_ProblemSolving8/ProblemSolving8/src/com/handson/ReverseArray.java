package com.handson;
import java.util.Scanner;
public class ReverseArray {
   public static void sort(int a[], int s, int e) {
       if (s < e) {
           int p = partition(a, s, e);
           sort(a, s, p - 1);
           sort(a, p + 1, e);
       }
   }
   public static int partition(int a[], int s, int e) {
       int p = a[s];
       int l = s + 1;
       int r = e;
       while (l <= r) {
           while (l <= e && a[l] <= p) {
               l++;
           }
           while (r >= s && a[r] > p) {
               r--;
           }
           if (l < r) {
               int temp = a[l];
               a[l] = a[r];
               a[r] = temp;
           }
       }
       int temp = a[s];
       a[s] = a[r];
       a[r] = temp;
       return r;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n1: ");
       int n1 = sc.nextInt();
       System.out.println("Enter array 1:");
       int a1[] = new int[n1];
       for (int i = 0; i < n1; i++) {
           a1[i] = sc.nextInt();
       }
       System.out.println("Enter n2: ");
       int n2 = sc.nextInt();
       System.out.println("Enter array 2:");
       int a2[] = new int[n2];
       for (int i = 0; i < n2; i++) {
           a2[i] = sc.nextInt();
       }
       if (n1 != n2) {
           System.out.println("false");
           return;
       }
       int s = 0, e = n2 - 1;
       sort(a2, s, e);
       boolean flag = true;
       for (int i = 0; i < n2; i++) {
           if (a1[i] != a2[i]) {
               System.out.println("false");
               flag = false;
               break;
           }
       }
       if (flag) {
           System.out.println("true");
       }
   }
}
