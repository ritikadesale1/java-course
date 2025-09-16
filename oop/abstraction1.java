package oop;

abstract class abstraction1 {
    public abstract void sound();
    public static void main(String[] args){
        abstraction1 obj = new dog();
        obj.sound();
    }
}
class dog extends abstraction1{
    public void sound(){
        System.out.println("Dog barks");
    }
    
}

