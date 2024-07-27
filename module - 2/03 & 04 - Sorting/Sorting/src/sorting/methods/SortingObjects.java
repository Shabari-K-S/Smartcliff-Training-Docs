package sorting.methods;

import java.util.Scanner;

class Products {
    String name;
    int price;
    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}

public class SortingObjects {
    public static void swapStr(Products[] arr, int left, int right) {
        Products temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void swap(Products[] arr, int left, int right) {
        Products temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void sortName(Products[] arr, int left, int right) {
        if (left < right) {
            // partition and swapping
            String pivot = arr[right].getName();

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (arr[j].getName().compareTo(pivot) < 0) {
                    i++;
                    swapStr(arr, i, j);
                }
            }
            int pi = i + 1;
            swapStr(arr, pi, right);
            sortName(arr, left, pi - 1);
            sortName(arr, pi + 1, right);
        }
    }

    public static void sortPrice(Products[] arr, int left, int right) {
        if (left < right) {
            // partition and swapping
            int pivot = arr[right].getPrice();

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (arr[j].getPrice() < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            int pi = i + 1;
            swap(arr, pi, right);

            // recursion
            sortPrice(arr, left, pi - 1);
            sortPrice(arr, pi + 1, right);
        }

    }


    public static void quickSort(Products[] products,String key) {
        if (key.compareToIgnoreCase("name") == 0) {
            sortName(products, 0, products.length - 1);
        } else if (key.compareToIgnoreCase("price") == 0) {
            sortPrice(products, 0, products.length - 1);
        }
    }

    public static void display(Products val) {
        System.out.println(val.getName() + " " + val.getPrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of product: ");
        int n = sc.nextInt();
        Products[] products = new Products[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the product name: ");
            String name = sc.next();
            System.out.print("Enter the product price: ");
            int price = sc.nextInt();
            products[i] = new Products(name, price);
        }
        System.out.print("Enter the key for quick sort (Name / Price): ");
        String key = sc.next();
        System.out.println("Sorting");
        quickSort(products, key);
        for (int i = 0; i < products.length; i++) {
            display(products[i]);
        }
    }
}
