package oop;

interface interface1 {
    void sound();
    void eat();
    
}
class dog implements interface1{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void eat(){
        System.out.println("Dog eats");
    }
    public static void main(String[] args) {
        interface1 obj = new dog();
        obj.sound();
        obj.eat();
    }
}

