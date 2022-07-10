public class Set7_Q2 {
    // Write a program to Print even number from 372 to 853.
    public static void main(String args[]) {
        int start_num = 372;
        int end_num = 853;
        for (int i = start_num; i <= end_num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
