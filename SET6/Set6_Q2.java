package SET6;

import java.util.Scanner;

public class Set6_Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the grade");
            int a = sc.nextInt();
            if (a >= 0 && a <= 35) {
                System.out.println("Fail");
            } else if (a >= 36 && a <= 40) {
                System.out.println("Pass Class");
            } else if (a >= 41 && a <= 50) {
                System.out.println("3rd Division");
            } else if (a >= 51 && a <= 60) {
                System.out.println("2nd Division");
            } else if (a >= 61 && a <= 70) {
                System.out.println("1st Division");
            } else if (a >= 71 && a <= 100) {
                System.out.println("Distinction");
            }
        }
    }

}