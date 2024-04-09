package org.launchcode;
import java.time.LocalDate;

// Class representing a single menu item
public class MenuItem {
    // Fields to store information about the menu item

    private String name; // Name of the menu item
    private String description; // Description of the menu item
    private double price; // Price of the menu item
    private String category; // Category of the menu item (appetizer, main course, dessert)
    private final LocalDate dateAdded; // Date when the menu item was added

    // Constructor to initialize the menu item with name, description, price, and category

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now(); // Set the date added to the current date
    }

    // Getter and setter methods for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
