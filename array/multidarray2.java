package array;

public class multidarray2 {
    public static void main(String[] args) {
        int[][] num = {
            {1, 2, 3 ,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }}

