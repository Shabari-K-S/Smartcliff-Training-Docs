package assessment;

import java.util.*;

class Product {
    String name;
    String SKU;
    int quantity;
    double price;

    public Product(String name, String SKU, int quantity, double price) {
        this.name = name;
        this.SKU = SKU;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryManagement {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, String SKU, int quantity, double price) {
        Product product = new Product(name, SKU, quantity, price);
        products.add(product);
    }

    public void removeProduct(String SKU) {
        for (Product product : products) {
            if (product.SKU.equals(SKU)) {
                products.remove(product);
                break;
            }
        }
    }

    public void updateProduct(String SKU, int quantity, double price) {
        for (Product product : products) {
            if (product.SKU.equals(SKU)) {
                product.quantity = quantity;
                product.price = price;
                break;
            }
        }
    }

    public Product searchProduct(String query) {
        for (Product product : products) {
            if (product.SKU.equals(query) || product.name.equals(query)) {
                return product;
            }
        }
        return null;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println("Name: " + product.name);
            System.out.println("SKU: " + product.SKU);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Price: " + product.price);
            System.out.println();
        }
    }
}

public class QuestionNo5 {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        System.out.println("Adding the below Product to the Inventory.");
        inventory.addProduct("Laptop", "Shabari123", 10, 500.0);
        inventory.addProduct("Mouse", "Sabari456", 20, 20.0);
        inventory.addProduct("Keyboard", "Shabari789", 15, 30.0);
        inventory.displayProducts();

        System.out.println("Removing Shabari456 from the inventory");
        inventory.removeProduct("Shabari456");

        System.out.println("Displaying All the product in the inventory");
        inventory.displayProducts();

        System.out.println("Updating Shabari123 in the Inventory.");
        inventory.updateProduct("Shabari123", 5, 600.0);

        System.out.println("Displaying All the product in the inventory");
        inventory.displayProducts();

        Product product = inventory.searchProduct("Shabari789");
        if (product != null) {
            System.out.println("Product found:");
            System.out.println("Name: " + product.name);
            System.out.println("SKU: " + product.SKU);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Price: " + product.price);
        } else {
            System.out.println("Product not found.");
        }
    }
}