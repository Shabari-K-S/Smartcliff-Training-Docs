package com.self_practice;
import java.util.Scanner;

class TaxOnSalary{
    double salary;
    boolean isPANsubmitted;

    public TaxOnSalary(){
        salary = 0.0;
        isPANsubmitted = false;
    }

    public TaxOnSalary(boolean isPANsubmitted){
        salary = 1000.0;
        this.isPANsubmitted = isPANsubmitted;
    }

    public double getSalary(){
        return salary;
    }

    public boolean getIsPANsubmitted(){
        return isPANsubmitted;
    }

    public void inputSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public double calculateTax(){
        if(salary < 180000 && isPANsubmitted){
            return 0.0;
        }
        else if(salary < 180000 && !isPANsubmitted){
            return salary * 0.05;
        }
        else if(salary < 500000){
            return salary * 0.10;
        }
        else if(salary < 1000000){
            return salary * 0.20;
        }
        else{
            return salary * 0.30;
        }
    }
}

public class Question10{
    public static void main(String[] args){
        TaxOnSalary tax1 = new TaxOnSalary(true);
        tax1.inputSalary();
        System.out.println("Tax: "+tax1.calculateTax());

        TaxOnSalary tax2 = new TaxOnSalary(false);
        tax2.inputSalary();
        System.out.println("Tax: "+tax2.calculateTax());
    }
}
