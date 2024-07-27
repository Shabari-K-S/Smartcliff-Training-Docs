package com.self_practice;

import java.util.Iterator;
import java.util.Vector;

public class VectorPractice {
    private Vector<String> products = new Vector<String>();

    public void addProduct(String name) {
        products.add(name);
    }

    public boolean removeProduct(String name) {
        return products.remove(name);
    }

    public void removeProductsByCategory(String category) {
        products.removeIf(product -> product.contains(category));
    }

    public boolean searchProduct(String name) {
        return products.contains(name);
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void listProducts() {
        products.forEach(System.out::println);
    }

    public int size() {
        return products.size();
    }

    public void increaseCapacity(int amount) {
        products.ensureCapacity(products.size() + amount);
    }

    public void trimCapacity() {
        products.trimToSize();
    }

    public void iterateProducts() {
        Iterator<String> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String[] convertToArray() {
        return products.toArray(new String[0]);
    }

    public void sortProductsByName() {
        products.sort(String::compareTo);
    }

    public void sortProductsByPrice() {
        products.sort((product1, product2) -> Integer.parseInt(product1.split(":")[1]) - Integer.parseInt(product2.split(":")[1]));
    }

    public void clearProducts(){
        products.clear();
    }

    public static void main(String[] args) {
        VectorPractice list = new VectorPractice();
        list.addProduct("Product1:100");
        list.addProduct("Product2:200");
        list.addProduct("Product3:300");

        list.listProducts();
        list.removeProduct("Product2:200");
        list.listProducts();

        System.out.println(list.searchProduct("Product1:100"));
        System.out.println(list.searchProduct("Product2:200"));

        System.out.println(list.size());

        list.iterateProducts();

        String[] productNames = list.convertToArray();
        for (String name : productNames) {
            System.out.println(name);
        }

        list.removeProductsByCategory("Product");
        list.listProducts();

        System.out.println(list.isEmpty());

        list.addProduct("Product4:400");
        list.addProduct("Product5:500");
        list.addProduct("Product6:600");

        list.listProducts();

        System.out.println(list.size());

        list.removeProductsByCategory("Product3");
        list.listProducts();

        System.out.println(list.isEmpty());

        list.sortProductsByName();

        list.listProducts();

        list.sortProductsByPrice();

        list.listProducts();

        list.addProduct("Product7:700");

        list.listProducts();

        list.clearProducts();

        list.listProducts();

        System.out.println(list.isEmpty());
    }
}