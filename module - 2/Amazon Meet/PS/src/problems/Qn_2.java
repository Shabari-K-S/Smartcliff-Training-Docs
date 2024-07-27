/*
 * Find the minimum value in triplet of three array
 *      Example:
 *        input:
 *          [ 5  2  8 ]
 *          [10  7 12 ]
 *          [ 9 14  6 ]
 *        output:
 *          2
 */

package problems;

import java.util.*;

public class Qn_2 {

    public static ArrayList<Integer> smallestTripletDifference(int[] a, int[] b, int[] c, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int m = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int k=0;

        int m1=0;
        int m2=0;
        int m3=0;

        while(i <n && j <n && k <n)
        {
            int sum = a[i] + b[j] +c[k];
            int max = Math.max(Math.max(a[i],b[j]),c[k]);
            int min = Math.min(Math.min(a[i],b[j]),c[k]);

            if(min == a[i])
                i++;
            else if(min == b[j])
                j++;
            else if(min == c[k])
                k++;

            if(m > max - min) {
                m = max - min;
                m1 = min;
                m3 = max;
                m2 = sum - (max + min);
            }
        }
        list.add(m3);
        list.add(m2);
        list.add(m1);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array-1 values: ");
        String[] str1 = sc.nextLine().trim().split(" ");
        System.out.println("Enter the array-2 values: ");
        String[] str2 = sc.nextLine().trim().split(" ");
        System.out.println("Enter the array-3 values: ");
        String[] str3 = sc.nextLine().trim().split(" ");

        int[] a = new int[str1.length];
        int[] b = new int[str2.length];
        int[] c = new int[str3.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(str2[i]);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = Integer.parseInt(str3[i]);
        }

        ArrayList<Integer> res = smallestTripletDifference(a,b,c,a.length);
        System.out.println(res);

    }
}
