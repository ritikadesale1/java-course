package BinaryOperations;

public class decimalToBinary {
    public static void main(String[] args) {
        int num = 16;
        int binary = 0;
        int first_digit = 0 ; 
        int place = 1 ; 
        while (num > 0) {
            first_digit = num % 2;
            binary = first_digit * place + binary; 
            num /= 2;
            place *= 10;
        }
        System.out.println(binary);
    }
}
