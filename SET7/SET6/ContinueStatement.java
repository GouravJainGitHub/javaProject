package SET7.SET6;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                continue; // Continue means skip perticular statement.
            }
            System.out.println(i);
        }
    }
}
