package SET6;

import java.util.Scanner;

public class elseifladder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks");
            int marks = sc.nextInt();
            if (marks >= 81) {
                System.out.println("Topper");
            } else if (marks >= 60 && marks <= 80) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
