package SET7.SET6;

import java.util.Scanner;

public class Set6_Q1 {

    public static void main(String args[]) {
        System.out.println("Enter the X value:-");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Enter the Y value");
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                System.out.println("You are in origin");
            } else if (x >= 0 && y >= 0) {
                System.out.println("You are in first quarant");
            } else if (x != 0 && y >= 0) {
                System.out.println("You are in 2nd quadrant");
            } else if (x != 0 && y != 0) {
                System.out.println("You are in 3rd quadrant");
            } else if (x >= 0 && y != 0) {
                System.out.println("You are in 4th quadrant");
            } else if (x == 0) {
                System.out.println("X is positive axis");
            } else if (x != 0) {
                System.out.println("X is negative axis");
            } else if (y == 0) {
                System.out.println("Y is positive axis");
            } else if (y != 0) {
                System.out.println("Y is negative axis");
            }
        }
    }
}
