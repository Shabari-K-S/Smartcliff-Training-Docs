package com.hands_on;

import java.util.*;

public class MaximumBuildingHeight {
    public static int maxBuilding(int n, int[][] restrictions) {
        Arrays.sort(restrictions, (a, b) -> Integer.compare(a[0], b[0]));
        int prevInd = 1, prevH = 0;
        for (int i=0; i<restrictions.length; i++) {
            restrictions[i][1] = Math.min(restrictions[i][1], prevH + (restrictions[i][0] - prevInd));
            prevInd = restrictions[i][0];
            prevH = restrictions[i][1];
        }
        for (int i=restrictions.length-2; i>=0; i--) {
            restrictions[i][1] = Math.min(restrictions[i][1], restrictions[i+1][1] + (restrictions[i+1][0] - restrictions[i][0]));
        }

        int ph = 0, pInd = 1, highest = 0;
        for (int i=0; i<restrictions.length; i++) {
            int ind = restrictions[i][0];
            int h = restrictions[i][1];
            if (ph < h) {
                h = Math.min(h, ph + (ind - pInd));
                int remains = Math.max(0, (ind-pInd) - (h - ph));
                highest = Math.max(highest, h + remains/2);
            } else {
                int remains = (ind-pInd) - (ph-h);
                highest = Math.max(highest, ph + remains/2);
            }
            ph = h;
            pInd = ind;;
        }
        highest = Math.max(highest, ph + (n-pInd));
        return highest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of restrictions: ");
        int m = sc.nextInt();
        int[][] restrictions = new int[m][2];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the building id and max height: ");
            restrictions[i][0] = sc.nextInt();
            restrictions[i][1] = sc.nextInt();
        }
        System.out.println(maxBuilding(n, restrictions));
    }
}