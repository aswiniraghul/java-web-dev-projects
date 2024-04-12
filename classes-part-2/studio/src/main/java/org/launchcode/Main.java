package org.launchcode;

public class Main {

    public static void main(String[] args) {

        // Create menu items for the menu

        MenuItem item1 = new MenuItem("Butter Chicken", "A creamy chicken dish with a rich tomato sauce", 10.99, "main course");
        MenuItem item2 = new MenuItem("Samosas", "Deep-fried pastry filled with spiced potatoes, peas, and lentils", 6.99, "appetizer");
        MenuItem item3 = new MenuItem("Chicken Tikka Masala", "Marinated chicken pieces cooked in a spicy tomato sauce", 11.99, "main course");
        MenuItem item4 = new MenuItem("Paneer Butter Masala", "Soft cheese cooked in a creamy tomato sauce with spices", 9.99, "main course");
        MenuItem item5 = new MenuItem("Kheer", "A sweet rice pudding with milk and spices", 5.99, "dessert");

        // Print the first menu item to test the toString method

        System.out.println(item1);

        // Create a new menu and add the menu items to it

        Menu myMenu = new Menu();
        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);
        myMenu.addItem(item4);
        myMenu.addItem(item5);

        // Print the menu to see all items

        System.out.println(myMenu);

        // Remove an item from the menu and print the updated menu

        myMenu.removeItem(item4);
        System.out.println(myMenu);

        // Test the equals method to check if two items are the same

        System.out.println(item1.equals(item2));




        // Create a new menu item with the same name as an existing item
        MenuItem item6 = new MenuItem("Paneer Butter Masala", "Soft cheese cooked in a creamy tomato sauce with spices", 9.99, "main course");
        // Add the new item to the menu and print the updated menu
        myMenu.addItem(item6);
        System.out.println(myMenu);
    }
}
