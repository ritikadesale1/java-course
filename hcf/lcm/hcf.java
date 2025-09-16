package hcf.lcm;

public class hcf {
    public static void main(String[] args) {
        int a = 12, b = 16;
        int hcf = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
        
        // Calculate LCM
        int lcm = (a * b) / hcf;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
