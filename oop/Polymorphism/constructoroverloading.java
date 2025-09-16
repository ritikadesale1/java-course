package oop.Polymorphism;
public class constructoroverloading {
    String name = "Unknown";
    int age = 0 ; 
    
    constructoroverloading() {
        System.out.println("Default name");
    }

    constructoroverloading(String name) {
        this.name = name ; 
        System.out.println("Parameterized Constructor with value: " + name);
    }
    constructoroverloading(int age) {
        this.age = age;
        System.out.println("Parameterized Constructor with value: " + age);
    }

    constructoroverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor with values: " + name + ", " + age);
    }

    public void display_info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        constructoroverloading obj1 = new constructoroverloading();
        constructoroverloading obj2 = new constructoroverloading("Alice");
        constructoroverloading obj3 = new constructoroverloading(25);
        constructoroverloading obj4 = new constructoroverloading("Bob", 30);
        obj1.display_info();
        obj2.display_info();
        obj3.display_info();
        obj4.display_info();
    }
}
