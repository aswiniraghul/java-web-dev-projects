package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

// Class representing a menu containing multiple menu items

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>(); // List to store menu items

    private LocalDate lastUpdated; // Date when the menu was last updated


    // Getter method to retrieve the list of menu items
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
