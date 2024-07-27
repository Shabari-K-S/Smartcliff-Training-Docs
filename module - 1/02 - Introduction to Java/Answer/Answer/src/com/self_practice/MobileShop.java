/**
 * 6. Identify the required variables to store the information of a mobile for a mobile shop. Create and show the sample data.
 */

package com.self_practice;

public class MobileShop {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Galaxy S21 Ultra";
        String color = "Phantom Black";
        double price = 1199.99;
        int ram = 12;
        int storage = 256;
        int camera = 108;
        int battery = 5000;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: Rs. " + price);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Camera: " + camera + " MP");
        System.out.println("Battery: " + battery + " mAh");
    }
}

