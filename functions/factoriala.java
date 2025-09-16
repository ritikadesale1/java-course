package functions;

public class factoriala {
    static int factoriala(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factoriala(n - 1);
        }
    }
    public static void main(String[] args) {
        int result = factoriala.factoriala(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
