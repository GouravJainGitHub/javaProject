public class Set7_Q5 {
    public static void main(String args[]) {
        // Write a program to print the numbers from 567 to 134 which are divisible 9
        // and not by 6.
        for (int i = 134; i <= 567; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                System.out.println(i);
            }
        }
    }
}
