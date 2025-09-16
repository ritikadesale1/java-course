package functions;

public class nofuncion {
    static int myFunction(int a , int b) {
        if(a > b) {
            return a ; 
        }
        else {
            return b ;
        }
    }
    public static void main(String[] args) {
        int x = myFunction(5, 10);  
        System.out.println("The maximum is: " + x);
    }
}
