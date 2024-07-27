import java.util.Scanner;

class A{
    static Scanner sc = new Scanner(System.in);
    static int a= 10;
}

public class Main {

    static {
        System.out.println("Inside the static block");
    }
    public static void main(String[] args) {
        System.out.println(A.a);
        A.a = 20;
        System.out.println(A.a);
        A.a= A.sc.nextInt();
        System.out.println("a = " +A.a );
        int b = A.sc.nextInt();
        System.out.println("b = "+ b);
        A.sc.close();

    }
    static {
        System.out.println("Inside the static block 2");
    }
}