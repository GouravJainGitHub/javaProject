package SET7;

public class Set7_Q3 {
    public static void main(String args[]) {
        // Write a program to print the odd numbers from 910 to 543.
        int frist_num = 910;
        int last_num = 543;
        for (int i = last_num; i <= frist_num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
