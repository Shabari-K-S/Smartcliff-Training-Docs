package com.self_practice;

import java.awt.image.SampleModel;

class Average{
    public void calculate(int a, int b, int c){
        float avg = (float) (a + b + c) /3;
        System.out.println("Average: "+avg);
    }
}

public class Question1{
    public static void main(String[] args){
        Average avg = new Average();
        avg.calculate(10, 20, 30);
    }
}