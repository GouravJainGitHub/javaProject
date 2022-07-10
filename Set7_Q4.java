public class Set7_Q4 {
    public static void main(String args[]) {
        // Write a program to Print the number which are divisible by 3 and 7 from 1 to
        // n.
        int n = 100;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
