package hcf.lcm;

public class lcm {
    public static void main(String[] args) {
        int a = 12, b = 16;
        int lcm2 ;
        int max; 

        if (a > b) {
            max = a ; 
        } else {
            max = b; 
        }
        for (int i = max; i <= a*b ; i++) {
            if (i % a == 0 && i % b == 0) {
                // System.out.println(i);
                lcm2 = i;
                break;
            }
        }

        // System.out.println("lcm of " + a + " and " + b + " is: " + lcm2);
    
    }
}
