package array;

public class multi3 {
    public static void main(String[] args) {
        int[][] num = {{0 , 0 , 0 , 0 }, {0 , 0 , 0 , 0 }, {0 , 0 , 0 , 0 }, {0 , 0 , 0 , 0 }} ; 
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = i + j + 2;
            }
            
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


    }
}
