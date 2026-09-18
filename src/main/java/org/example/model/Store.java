package org.example.model;

public class Store {

    public static void main(String[] args) {

        ProductForSale[] products = {
                new Chocolate("Chocolate", 50, "Milk Chocolate"),
                new Coke("Coke", 30, "Cold Drink"),
                new Bread("Bread", 20, "Fresh Bread")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}
