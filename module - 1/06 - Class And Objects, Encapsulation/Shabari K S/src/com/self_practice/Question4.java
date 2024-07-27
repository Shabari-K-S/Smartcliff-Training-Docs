package com.self_practice;

class Crop{
    public Crop(){
        System.out.println("C 15 P 25 B 30");
    }

    public Crop(int carrot, int potato, int brinjal){
        System.out.println("C "+carrot+" P "+potato+" B "+brinjal);
    }
}

public class Question4{
    public static void main(String[] args){
        Crop crop1 = new Crop();
        Crop crop2 = new Crop(15, 25, 30);
    }
}
