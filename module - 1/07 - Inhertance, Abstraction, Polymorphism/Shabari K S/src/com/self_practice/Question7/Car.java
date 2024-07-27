package com.self_practice.Question7;

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}