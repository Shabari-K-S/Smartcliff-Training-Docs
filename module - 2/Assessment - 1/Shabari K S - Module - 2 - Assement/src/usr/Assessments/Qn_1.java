package usr.Assessments;

/*
 *  Question 1: Score of a String
 *      Problem Statement: You are given a string s. The score of a
 *          string is defined as the sum of the absolute difference between
 *          the ASCII values of adjacent characters. Return the score of s.
 *      Example 1:
 *          Input: s = "hello"
 *          Output: 13
 *      Explanation:
 *          The ASCII values of the characters in s are:
 *          'h' = 104, 'e' = 101,  'l' = 108, 'o' = 111. So, the score of s would be
 *                  |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111|
 *                  = 3 + 7 + 0 + 3 = 13.
 *
 *  @author: Shabari K S
 */

import java.util.Scanner;

public class Qn_1 {
    private static int absDiff(int a, int b) {
        if ( a - b <= 0) return (a - b) * - 1;
        else return (a - b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int res = 0;
        for(int i=0; i<str.length()-1; i++) {
            res += absDiff(str.charAt(i), str.charAt(i+1));
        }
        System.out.println(res);
    }
}
