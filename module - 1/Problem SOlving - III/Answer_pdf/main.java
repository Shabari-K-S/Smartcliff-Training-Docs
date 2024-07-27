/*
 * 
 * Subarrays With Equal 0’s, 1’s and 2’s
Problem statement : You are given an array containing ‘N’ integers. In the
array, the elements are 0, 1 and 2. You have a simple task, find the count of
non-empty subarrays containing an equal number of 0’s, 1’s and 2’s.
The subarray of ARR is a contiguous part of the array ARR, i. e. the array ARRi,
ARRi+1, . . . . . , ARRj for some 0 ≤ i ≤ j ≤ N - 1.
For Example :
If ‘N’ = 5, ‘ARR’ = {1, 1, 0, 2, 1}
There are exactly two subarrays that contain an equal number of 0’s, 1’s and
2’s. 

The first subarray is from ‘ARR[1]’ to ‘ARR[3]’, ie: {1, 0, 2}.
The second subarray is from ‘ARR[2]’ to ‘ARR[4]’, ie: {0, 2, 1}.
Sample Input 1 :
2
5
1 1 0 2 1
4
1 1 0 0
Sample Output 1 :
2
0
Explanation For Sample Input 1 :
For test case 1 :
We will print 2 because:
There are exactly two subarrays that contain an equal number of 0’s, 1’s and
2’s.
The first subarray is from ARR[1] to ARR[3], ie: {1, 0, 2}, and the second
subarray is from ARR[2] to ARR[4], ie: {0, 2, 1}
For test case 2 :
We will print 0 because:
The input array doesn’t contain any element equal to 2, so it’s impossible to
form a non-empty subarray with an equal number of 0’s, 1’s and 2’s.
Sample Input 2 :
2
6
1 0 2 1 0 2
61 1 0 0 2 2
Sample Output 2 :
5
1
Constraints :
1 ≤ T ≤ 10
1 ≤ N ≤ 1000
ARR[i] = {0, 1, 2}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(subarraysWithEqual012(arr, n));
        }
    }
}