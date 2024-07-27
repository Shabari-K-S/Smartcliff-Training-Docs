/*
 *  Question:
 *      remove couple string
 *  Example:
 *      Input:
 *          ab aa ad ac aa
 *      Output:
 *          ab ad ac
 */

package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qn_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String[] s = sc.nextLine().trim().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : s) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for(String key : s) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            } else if (map.get(key)%2 != 0) {
                System.out.print(key + " ");
                map.put(key, map.getOrDefault(key, 0) - 1);
            }
        }
    }
}
