package oop;

public class employee {
    private String name;    
    private int id;
    private String department;  

    public employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        employee emp1 = new employee("Alice", 1001, "HR");
        emp1.displayInfo();
    }
}
