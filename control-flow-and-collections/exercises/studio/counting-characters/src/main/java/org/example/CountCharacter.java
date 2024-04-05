package org.example;

import java.util.HashMap;
import java.util.Map;
public class CountCharacter {
    public static void main(String[] args) {
        // Input string

        String line = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there. ";


        //convert string to Array

                 char[] charArray = line.toCharArray();

                 HashMap<Character, Integer> counts = new HashMap<>();

        // Iterate through each character in the array

        for (char letter : charArray) {
            // If the character already exists in the map, increment its count

            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            } else {

                // If the character is encountered for the first time, add it to the map with count 1

                counts.put(letter, 1);
            }
        }

        // Iterate through the map entries to print character counts

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}