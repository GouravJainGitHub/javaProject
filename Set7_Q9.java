public class Set7_Q9 {
    public static void main(String args[]) {
        // Wrtie a program to print 1,4,9,16.25,36,49,64,81,100.
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= i; j++) {
                int mul = i * j;
                System.out.println(mul);
            }
        }
    }
}
