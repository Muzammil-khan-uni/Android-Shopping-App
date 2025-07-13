package com.empirer.shoppingapp;

public class Product implements java.io.Serializable {
    private final String name;
    private final String description;
    private final double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
}
