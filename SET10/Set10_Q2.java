package SET10;

public class Set10_Q2 {
    public static void main(String args[]) {
        // Write a program to find the sum of digits of given number.
        int sum = 0, digit = 0;
        int num = 1234;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
