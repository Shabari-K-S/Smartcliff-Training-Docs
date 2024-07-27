package com.hands_on;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);


        int start = 0;
        int end = nums.length;

        while(start<=end){

            int mid = start+ (end-start)/2;
            int ans = count(nums, mid);

            if(ans == mid) return mid;
            else if(ans>mid)    start = mid+1;
            else end = mid-1;


        }


        return -1;
    }
    static int count(int []nums, int target){
        int ans = 0;
        for(int num : nums){
            if(num>=target) ans++;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }

}
