package recursion;

public class fibonacci {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int number = 8;
        int result = fib(number);
        System.out.println("Fibonacci of " + number + " is: " + result);
    }   
}
