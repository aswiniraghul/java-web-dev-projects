package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BonusTwo {
    public static void main(String[] args) {

        String inputFromFile = "";

        try {
            File textFromFile = new File("control-flow-and-collections/exercises/studio/counting-characters/src/main/java/org/example/Input.txt");
            Scanner myInput = new Scanner(textFromFile);
            if (myInput.hasNextLine()) {
                inputFromFile = myInput.nextLine();
            }
            myInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when trying to read.");
        }

        char[] charArray = inputFromFile.toUpperCase().toCharArray();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}

