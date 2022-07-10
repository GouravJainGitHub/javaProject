package SET7.SET6;

import java.util.Scanner;

public class nestedifelseex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the A value");
            int a = sc.nextInt();
            System.out.println("Enter the B Value");
            int b = sc.nextInt();
            System.out.println("Enter the C Value");
            int c = sc.nextInt();
            if (a > b) {
                if (a > c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            } else {
                if (a > b) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
        }
    }
}
