package SET10;

public class Set10_Q1 {
    public static void main(String args[]) {
        // Write a program to find factorial of a number.
        int n = 5;
        int i = 1;
        int sum = 1;
        while (i <= n) {
            sum = sum * i;
            System.out.println(sum);
            i++;
        }
    }
}
