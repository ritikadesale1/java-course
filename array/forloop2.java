package array;

public class forloop2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0 ; i < num.length ; i++){
            num[i] = num[i] + 1 ; 
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
