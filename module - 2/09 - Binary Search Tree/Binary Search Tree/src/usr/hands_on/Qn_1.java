package usr.hands_on;

import java.util.*;

public class Qn_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Values of the list: ");
        String str = sc.nextLine();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                list.add(str.charAt(i) - '0');
                list1.add(str.charAt(i) - '0');
            }
        }
        Collections.sort(list);
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), list1.get(i))) {
                System.out.println("It is not a BST");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("It is a BST");
        }
    }
}
