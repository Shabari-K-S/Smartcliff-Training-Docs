import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sr = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<sr.length(); i++){
            if (i==0){
                result.append(sr.charAt(i));
            }
            else if (sr.charAt(i) != sr.charAt( i-1 )){
                result.append(sr.charAt(i));
            }
        }
        System.out.println(result);

    }
}