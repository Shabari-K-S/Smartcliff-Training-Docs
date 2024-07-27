package com.hands_on.Question11;

public class GasMotorCycle implements Vehicle, GasVehicle{
    @Override
    public void refuel() {
        System.out.println("The Gas Vehicle is refueling");
    }

    @Override
    public void start() {
        System.out.println("The Gas Vehicle is started");
    }

    @Override
    public void stop() {
        System.out.println("The Gas Vehicle is stopped");
    }
}
