package com.self_practice.Question7;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle Started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle Stopped");
    }
}
