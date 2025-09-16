public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int temp;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a=b;
        b=temp;
        // Alternatively, you can swap without a temporary variable
        // a = a + b;
        // b = a - b;
        // a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
