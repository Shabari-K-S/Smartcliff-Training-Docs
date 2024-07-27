/*
 *  Question:
 *      Valid Parenthesis
 */

package problems;

import java.util.Scanner;

public class Qn_3 {
    public static int countParenthesisOptimized(String args) {
        int cnt = 0;
        for(char c : args.toCharArray()){
            if (c == ')' || c == '}' || c == ']') {
                cnt+=1;
            }
        }
        return cnt;
    }

    public static int countOpen(String args, int len) {
        int count = 0;
        for(int i=0;i<len;i++) {
            if (args.charAt(i) == '(' || args.charAt(i) == '{' || args.charAt(i) == '[' ) {
                count+=1;
            }
        }
        return count;
    }

    public static int countClose(String args,int len) {
        int count = 0;
        for(int i=len;i<args.length();i++) {
            if (args.charAt(i) == ')' || args.charAt(i) == '}' || args.charAt(i) == ']' ) {
                count+=1;
            }
        }
        return count;
    }
    public static void countParenthesis(String str) {
        int low = 0, high = str.length() - 1;
        int mid = 0;
        boolean flag = false;
        while (low <= high) {
            mid = (low + high )/2;
            int co = countOpen(str, mid);
            int cc = countClose(str, mid);
            if (co == cc) {
                System.out.println(mid);
                flag = true;
                break;
            } else if (co > cc) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (!flag) {
            System.out.println(mid);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input parenthesis: ");
        String s = sc.nextLine();
        countParenthesis(s);
        System.out.println(countParenthesisOptimized(s));
    }
}
