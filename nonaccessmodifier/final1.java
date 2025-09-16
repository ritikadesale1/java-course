package nonaccessmodifier;

public class final1 {
    final int speedlimit=90;
    public void run()
    {
        // speedlimit=400; // we cannot change the value of final variable
        System.out.println("Speed Limit: "+speedlimit);
    }
    public static void main(String[] args) {
        final1 obj=new final1();
        obj.run();
    }
}
