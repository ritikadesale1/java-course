package oop.Encapsulation;

public class getset {
    public String name ; 
    public String age ; 
    private String dob = "01/01/2000"; 
    private String password = "1234"; 

    public void get_details(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Password : " + password );
    }

    public void set_dob(String inputDob){
        dob = inputDob ;
    }

    public void set_Password(String inputPassword){
        password = inputPassword ; 
    }

    public static void main(String[] args) {
        getset obj = new getset() ; 
        obj.name = "John" ; 
        obj.age = "21" ; 
        // obj.dob = "02/02/2002"; // we cannot access private variable outside the class
        // obj.password = "abcd"; // we cannot access private variable outside the class
        obj.get_details();
        obj.set_dob("02/02/2002");
        obj.set_Password("abcd");
        obj.get_details();

    }}
