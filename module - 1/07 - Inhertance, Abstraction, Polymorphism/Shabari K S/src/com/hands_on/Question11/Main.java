package com.hands_on.Question11;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasMotorCycle gasMotorcycle = new GasMotorCycle();

        electricCar.start();
        electricCar.charge();
        electricCar.stop();

        gasMotorcycle.start();
        gasMotorcycle.refuel();
        gasMotorcycle.stop();
    }
}
