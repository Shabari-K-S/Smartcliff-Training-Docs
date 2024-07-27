package com.hands_on;

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int prev=0,i=0;
        while(i<n){
            if(arr[i]==prev+1){
                i++;
            }
            else{
                k--;
                if(k==0) return prev+1;
            }
            prev++;
        }
        while(k>0){
            k--;
            prev++;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(vec, k);
        System.out.println("The missing number is: " + ans);
    }
}
