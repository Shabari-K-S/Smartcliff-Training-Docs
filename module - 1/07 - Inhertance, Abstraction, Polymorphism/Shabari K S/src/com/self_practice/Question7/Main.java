package com.self_practice.Question7;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicles = {new Car(), new Motorcycle(), new Truck()};
        for(Vehicle v : vehicles){
            v.start();
        }
        for(Vehicle v : vehicles){
            v.stop();
        }
    }
}
