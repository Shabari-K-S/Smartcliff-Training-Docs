package assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the event name: ");
        String event = sc.nextLine();
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        if (size <= 0){
            System.out.println("The size of array must be positive");
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the array Elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr.get(i) == arr.get(j))
                    count++;
            }
        }

        System.out.println("For the event "+ event+ " the count of good pair is " + count);
    }
}
