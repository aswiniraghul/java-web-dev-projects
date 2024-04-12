package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    // Fields to store the menu items and the last update date

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Default constructor
    public Menu() {
        // Initialize the menu with an empty list of items

        this.menuItems = new ArrayList<>();
        // Set the last updated date to the current date

        this.lastUpdated = LocalDate.now();
    }

    // Getter for the menu items
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Override the toString method to provide a custom string representation of the menu
    @Override
    public String toString() {
        // Initialize a StringBuilder to build the string representation of appetizers

        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {

            // Check if the item's category is "appetizer"
            if (item.getCategory().equals("appetizer")) {

                // Append the item's string representation to the appetizers StringBuilder
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nFLAVOURS\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";

    }

    //This method adds a new menu item to the menu.
    //It first checks if the menu already contains the item. If so, it prints a message and returns without adding the item.
    // If the item is not in the menu, it iterates through the menu items to check for equality.
    // If an equal item is found, it prints a message and returns without adding the item.
    // If no equal item is found, it adds the new item to the menu and updates the lastUpdated date.

    void addItem(MenuItem newItem) {
            String message = "The Item is added to the menu.";
            if (menuItems.contains(newItem)) {
                System.out.println(message);
                return;
            }

        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }


    // This method removes a specified menu item from the menu.
   // It directly removes the item from the menuItems list and updates the lastUpdated date.
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}