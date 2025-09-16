package ifelsepractice;

public class studentsbatch {
    public static void main(String[] args) {
        int age = 20;
        int standards = 10;
        int marks = 85;
        if(age<=15 && marks<=33 && standards<=5) {
            System.out.println("Student can't go on trip.");
        } else {
            System.out.println("Student can go on trip.");
        }
    }
}
