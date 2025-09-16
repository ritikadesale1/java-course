package functions;

public class powerfunction {
    static void power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Final result: " + result);
    }

    public static void main(String[] args) {
     power(4, 3);
    }
}
