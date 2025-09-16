package oop;

public class changename {
    private String name;

    public changename(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        changename obj = new changename("John");
        obj.getName();
        obj.setName("Doe");
        obj.getName();
    }
}
