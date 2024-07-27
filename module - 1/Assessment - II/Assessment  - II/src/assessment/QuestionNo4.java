package assessment;

import java.util.*;

public class QuestionNo4 {
    public static boolean isPalindromicPermutation(String username) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : username.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user id: ");
        String userId = sc.nextLine();
        System.out.print("Enter the username: ");
        String username = sc.nextLine();
        System.out.println(isPalindromicPermutation(username));
    }
}