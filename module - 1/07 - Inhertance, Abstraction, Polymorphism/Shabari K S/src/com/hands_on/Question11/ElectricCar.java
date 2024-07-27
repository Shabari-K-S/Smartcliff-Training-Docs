package com.hands_on.Question11;

class ElectricCar implements Vehicle, ElectricVehicle {
    @Override
    public void charge() {
        System.out.println("The Electric car is charging");
    }

    @Override
    public void start() {
        System.out.println("The Electric car is started");
    }

    @Override
    public void stop() {
        System.out.println("The Electric car is stopped");
    }
}
