package org.launchcode;

import java.util.Scanner;
public class AliceRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?";
        System.out.println(aliceStr);
        System.out.println("Word to index and remove?");
        String aliceWord = input.nextLine().toLowerCase();
        Integer index = aliceStr.toLowerCase().indexOf(aliceWord);
        Integer length = aliceWord.length();
        System.out.println("Your word appears at index " + index + ". Your word is " + length + " characters long.");
        aliceStr = aliceStr.toLowerCase().replace(aliceWord.toLowerCase(), "");
        System.out.println(aliceStr);
    }
}