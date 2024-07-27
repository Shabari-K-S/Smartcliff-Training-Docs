package com.hands_on.Question4;


public class Main {
    public static void main(String[] args) {
        User user = new User("Shabari_123", "Shabari@123");
        User user2 = new User("Sandy_123", "Sandy");
        try {
            user.validateUsername();
            user.validatePassword();
            System.out.println("Welcome " + user.username);
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Invalid username or password");
        }
        try {
            user2.validateUsername();
            user2.validatePassword();
            System.out.println("Welcome " + user.username);
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Invalid username or password");
        }
    }
}

