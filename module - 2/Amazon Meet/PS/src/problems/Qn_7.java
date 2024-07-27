package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn_7 {
    public static int findMin(ArrayList<Integer> arr) {
        int min = arr.getFirst();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int k = i; k <=j; k++)
                    temp.add(nums[k]);
                list.add(temp);
            }
        for(ArrayList<Integer> l : list) {
            int minVal = findMin(l);
            if (minVal == l.getFirst())
                System.out.println(l);
        }
    }
}
