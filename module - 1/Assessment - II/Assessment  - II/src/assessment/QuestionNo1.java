package assessment;

import java.util.Scanner;

class NotAIsogramException extends Exception {
    NotAIsogramException(String str) {
        super(str);
    }
}

public class QuestionNo1 {
    public static boolean isIsogram(String key) throws NotAIsogramException {
        for (int i = 0; i < key.length(); i++) {
            for(int j = i + 1; j < key.length(); j++){
                if (key.charAt(i) == key.charAt(j))
                    throw new NotAIsogramException("The secret key is not an Isogram");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Secret Key for the Lock: ");
            String key = sc.nextLine();
            try {
                if (isIsogram(key)) {
                    System.out.println("The secret key is an Isogram.");
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
