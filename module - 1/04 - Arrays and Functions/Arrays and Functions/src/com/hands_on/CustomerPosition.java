package com.hands_on;

import java.util.Scanner;

public class CustomerPosition {
    // using function to find the position of the customer
    public int findPosition(String[] names, String customer){
        for(int i=0; i<names.length; i++){
            if(names[i].equals(customer)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        System.out.println("Enter the customer names: ");
        for(int i=0; i<n; i++){
            names[i] = sc.nextLine();
        }

        System.out.print("Enter the customer name to find the position: ");
        String customer = sc.nextLine();

        CustomerPosition cp = new CustomerPosition();
        int position = cp.findPosition(names, customer);
        System.out.println("The Position of "+customer+ " is "+ position);

        sc.close();
    }
}