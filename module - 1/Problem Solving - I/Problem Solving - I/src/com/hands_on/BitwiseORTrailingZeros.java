package com.hands_on;

import java.util.Scanner;

public class BitwiseORTrailingZeros {
	public static boolean bitwiseORTrailingZeros(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] | nums[j]) % 2 == 0) {
                        return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(bitwiseORTrailingZeros(arr));
	}
}
		