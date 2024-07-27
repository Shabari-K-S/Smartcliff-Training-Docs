package com.hands_on.Question1;

class Citizen {
    String aadharNumber, name, city, state, country;
    Citizen(String aadharNumber, String name, String city, String state, String country) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    void validateCountry() throws NoMatchException {
        if(!country.equals("India")) {
            throw new NoMatchException("Country name is not equal to India");
        }
    }
}