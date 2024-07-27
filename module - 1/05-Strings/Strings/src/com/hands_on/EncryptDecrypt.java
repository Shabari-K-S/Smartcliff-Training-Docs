package com.hands_on;

import java.util.Scanner;

public class EncryptDecrypt {
    static void encrypt(String str){
        System.out.print("Encrypted String: ");
        String encryptedText = "";
        for(char c : str.toCharArray()) {
            System.out.print((char)(c+2));
            encryptedText += (char)(c+2);
        }
        System.out.println();
        decrypt(encryptedText);
    }

    static void decrypt(String str){
        System.out.print("Decrypted String: ");
        for(char c : str.toCharArray()) {
            System.out.print((char)(c-2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to encrypt: ");
        String text = sc.nextLine();
        encrypt(text);
    }
}
