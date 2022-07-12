package SET7;

public class Set7_Q8 {
    public static void main(String args[]) {
        // Write a program to print Multiplication table 1 to 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                int mul = i * j;
                System.out.println(mul);
            }
        }
    }
}
