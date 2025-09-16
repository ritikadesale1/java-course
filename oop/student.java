package oop;

public class student{
    public String name ;  
    public int rollNumber;
    public int age;
    public int grade;
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "John";
        s1.rollNumber = 101;
        s1.age = 20;
        s1.grade = 3;
        s1.displayInfo();
    }
}