package BinaryOperations;
public class binaryToDecimal {
    public static void main(String[] args) {
        int num = 101011;
        int ans = 0 ,rem = 0;
        int i = 0;
        while(num!=0){
        rem = num%10;
        num=num/10;
        ans+=rem*Math.pow(2,i);
        i++;
        }
        System.out.println(ans);
    }
}
