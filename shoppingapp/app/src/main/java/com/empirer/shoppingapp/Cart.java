package com.empirer.shoppingapp;

import java.util.ArrayList;

public class Cart {

    private static Cart instance;
    private final ArrayList<Product> cartItems;

    private Cart() {
        cartItems = new ArrayList<>();
    }

    public static synchronized Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeFromCart(Product product) {
        cartItems.remove(product);
    }

    public ArrayList<Product> getItems() {
        return cartItems;
    }

    public double getTotal() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart() {
        cartItems.clear();
    }
}
