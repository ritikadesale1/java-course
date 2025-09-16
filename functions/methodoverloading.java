package functions;

public class methodoverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        int intSum = add(5, 10);
        double doubleSum = add(5.5, 10.5);
        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
