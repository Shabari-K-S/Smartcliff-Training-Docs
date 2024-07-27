/**
 * 22. Electricity bill calculator: Calculate the bill for 30 days based on
 *     the given below data.
 * a) There are 2 fans of 60W each. Usage of each fan is 6 hours per day.
 * b) There are 3 lights of 40W each. Usage of each light is 8 hours per day.
 * c) For the other electrical appliances, the total consumption per day is 3000W.
 * d) Cost of 1 unit is Rs.6
 *
 * @author: Shabari K S
 */

package com.hands_on;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        int fanPower = 60;
        int fanUsage = 6;
        int lightPower = 40;
        int lightUsage = 8;
        int otherPower = 3000;
        int days = 30;
        double costPerUnit = 6.00;

        double fanConsumption = 2 * fanPower * fanUsage * days;
        double lightConsumption = 3 * lightPower * lightUsage * days;
        double otherConsumption = otherPower * days;
        double totalConsumption = fanConsumption + lightConsumption + otherConsumption;
        double bill = totalConsumption / 1000 * costPerUnit;

        System.out.println("Electricity Bill: " + bill);
    }
}