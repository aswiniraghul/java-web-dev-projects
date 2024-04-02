package org.launchcode;

import java.util.Scanner;
    public class RectangleArea {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input Length:");
            Float length = input.nextFloat();
            System.out.println("Input Width:");
            Float width = input.nextFloat();
            System.out.println("Rectangle Area Is: " + length * width);
        }
    }

