package SET6;

import java.util.Scanner;

public class Set6_Q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int marks = sc.nextInt();
            if (marks >= 0 && marks <= 15000) {
                System.out.println("Peon");
            } else if (marks >= 15001 && marks <= 25000) {
                System.out.println("2nd Division Clerk");
            } else if (marks >= 25001 && marks <= 35000) {
                System.out.println("1st Division Clerk");
            } else if (marks >= 35001 && marks <= 45000) {
                System.out.println("Assistant Manager");
            } else if (marks >= 45001 && marks <= 60000) {
                System.out.println("Manager");
            } else if (marks >= 60000) {
                System.out.println("Deputy Manager");
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
