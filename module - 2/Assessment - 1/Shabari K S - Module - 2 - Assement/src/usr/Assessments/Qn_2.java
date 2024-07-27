/*
    Question: Magical String
        Problem statement : Haibara hates that Conan is always
            grasped in murder mysteries. So this time she gives Conan a
            simple problem to solve in which he is given a string 'S'
            consisting of lowercase and uppercase characters.
            She tells him that a "Magical String" is a string that does not
            have an adjacent pair of the same characters with one character
            being lowercase and the other being uppercase. Formally, 'S' is
            magical if there exists no 'i' such that 'S[i]' is a lowercase
            character and 'S[ i + 1]' is the same character but in uppercase
            or vice-versa.
            Now, Conan has to make the string 'S' magical by removing the
            minimum number of characters and return Hibara the magical
            string hence made.
            Your task is to help Conan to obtain the magical string.
        Note :
            An empty string is also magical.
        Example 1:
            Input:
                sweeEet
                codeE
            Output :
                sweet
                cod
            Explanation :
                In the first test case, either you choose i = 3 or i = 4, both
                will have the same result “sweet”.
                In the second test case, there is only one option i.e i = 3.
                Hence, the result will be “cod”
 */

package usr.Assessments;

import java.util.Scanner;

public class Qn_2 {
    public static String magicalString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (sb.length() == 0) {
                sb.append(str.charAt(i));
            } else {
                if (Math.abs(sb.charAt(sb.length() - 1) - str.charAt(i)) == 32) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String val = sc.nextLine();
        System.out.println(magicalString(str));
        System.out.println(magicalString(val));
    }
}