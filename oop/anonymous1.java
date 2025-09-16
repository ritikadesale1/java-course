package oop;

 class anonymous1 {
    public void display(){
        System.out.println("animal sound" );
    }
}
class Main{
    public static void main(String[] args) {
        anonymous1 animal = new anonymous1(){
            public void display(){
                System.out.println("cat meows" );
            }
        };
        animal.display();
    }
}
