package patterns;

public class nopattern2 {
    
    public static void main(String[] args) {
        int n = 6;
        int numtimes = 1; 
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print( "  ");
            }
           numtimes = 1 ; 
            for (int j = 1 ; j <= 2*i - 1; j++){
                System.out.print(numtimes + " ");
                if (j < i) {
                    numtimes++;
                } else {
                    numtimes--;
                }
                
            }
            System.out.println();
        }
    }
}
