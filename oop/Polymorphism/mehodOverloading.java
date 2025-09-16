package oop.Polymorphism;

public class mehodOverloading {

    public void sum(int a , int b ){
        System.out.println(a+b);
    }

    public void sum(double a , double b){
        System.out.println(a+b);
    }
    public void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        mehodOverloading obj = new mehodOverloading();
        obj.sum(5, 10);
        obj.sum (5.5, 10.5);
        obj.sum(5, 10, 15);
    }
}
