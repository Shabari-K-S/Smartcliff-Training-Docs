package com.hands_on;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0; // Initialize sums of Alice's and Bob's candies
        Set<Integer> bobCandies = new HashSet<>(); // Create a set to store Bob's candy sizes
        for (int candySize : aliceSizes) {
            sumAlice += candySize;
        }
        for (int candySize : bobSizes) {
            bobCandies.add(candySize);
            sumBob += candySize;
        }
        int balanceDiff = (sumAlice - sumBob) >> 1;
        for (int aliceCandySize : aliceSizes) {
            int targetSize = aliceCandySize - balanceDiff;
            if (bobCandies.contains(targetSize)) {
                return new int[]{aliceCandySize, targetSize};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = {2, 3};
        int[] res = fairCandySwap(arr, arr2);
        assert res != null;
        for( int i : res) {
            System.out.print(i + " ");
        }
    }
}
