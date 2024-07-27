import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rotate = 3;
        for(int i=0;i<rotate;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}