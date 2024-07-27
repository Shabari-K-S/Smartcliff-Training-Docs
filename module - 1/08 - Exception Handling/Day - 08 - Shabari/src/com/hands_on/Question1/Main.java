package com.hands_on.Question1;

public class Main {
    public static void main(String[] args) {
        Citizen citizen1 = new Citizen("123456789012", "Shabari", "Salem", "Tamil Nadu", "India");
        Citizen citizen2 = new Citizen("123456789012", "Sandy", "Jeru Salem", "Canada", "USA");
        try {
            citizen1.validateCountry();
            citizen2.validateCountry();
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
