package com.hands_on.Question9;

class ArrayOverloading {
    void processArray(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum+= i;
        }
        System.out.println("The sum of array elements is "+ sum);
    }

    void processArray(int[] arr, int n){
        switch (n) {
            case 1:
                int max = arr[0];
                for (int i : arr)
                    if (i > max)
                        max = i;
                System.out.println("Tha greatest element in the arrays is " + max);
                break;
            case 2:
                int avg = 0;
                for (int i : arr)
                    avg += i;
                System.out.println("The average elements of the array is " + (double) (avg / arr.length));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
