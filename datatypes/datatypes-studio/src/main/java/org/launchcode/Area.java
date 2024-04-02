package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
       double radius;
        radius = input.nextDouble();
//        boolean validation = true;
//        do {
//            if (!validation) {
//                System.out.println("That number is invalid.");
//            }
//            radius = input.nextDouble();
//            validation = false;
//        } while (radius < 1 || radius > 100);
        input.close();
//        double area = Math.PI * (radius * radius);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
