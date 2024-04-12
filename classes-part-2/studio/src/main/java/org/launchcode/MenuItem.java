package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    // Fields to store the properties of a menu item
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded; // Date when the item was added to the menu

    // Constructor to initialize a new menu item
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now(); // Set the current date as the date added
    }

    // Getters and setters for each field
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

    // Override the toString method to provide a custom string representation of the menu item
    @Override
    public String toString() {
        String display = isNew() ? " - ITS NEW " : ""; // Check if the item is new and add a label if so
        return name + display + "\n" +
                description + " The Price is: $" + price;
    }

    // Override the equals method to compare menu items based on their names
    @Override
    public boolean equals(Object toBeCompared) {

        if (this == toBeCompared) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }

    // Method to check if the menu item is new (added within the last 90 days)
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
}
