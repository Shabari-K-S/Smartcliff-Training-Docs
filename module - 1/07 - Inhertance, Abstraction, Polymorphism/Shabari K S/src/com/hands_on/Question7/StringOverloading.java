package com.hands_on.Question7;

class StringOverloading {
    void ProcessString(String str){
        System.out.println("Original String: " + str);
    }

    void ProcessString(String str, int option){
        switch(option){
            case 1:
                System.out.println("Uppercase String: " + str.toUpperCase());
                break;
            case 2:
                StringBuilder sb = new StringBuilder(str);
                System.out.println("Reversed String: " + sb.reverse());
                break;
            case 3:
                System.out.println("Length of String: " + str.length());
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
