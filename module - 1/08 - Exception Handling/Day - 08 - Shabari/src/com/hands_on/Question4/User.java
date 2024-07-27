package com.hands_on.Question4;

class User {
    String username, password;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    void validateUsername() throws InvalidUsernameException {
        if(username.length() < 6 || username.length() > 30) {
            throw new InvalidUsernameException("Invalid username");
        }
        if(!username.matches("^[a-zA-Z][a-zA-Z0-9_]*$")) {
            throw new InvalidUsernameException("Invalid username");
        }
    }

    void validatePassword() throws InvalidPasswordException {
        if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-+]).{8,}$")) {
            throw new InvalidPasswordException("Invalid password");
        }
    }
}
