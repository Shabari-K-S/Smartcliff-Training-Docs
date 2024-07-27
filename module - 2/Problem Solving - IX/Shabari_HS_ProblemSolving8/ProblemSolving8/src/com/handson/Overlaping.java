package com.handson;

import java.util.*;

public class Overlaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][2]; 
        
        System.out.println("Enter the intervals ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt(); 
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        boolean canAttendAll = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i][1] > arr[i + 1][0]) {
                canAttendAll = false;
                break;
            }
        }

        System.out.println(canAttendAll ? "false" : "true");
        sc.close();

	}

}
