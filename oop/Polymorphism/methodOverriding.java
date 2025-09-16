package oop.Polymorphism;
// Consider case of Birds 
 class methodOverriding {
    public void chirp() {
        System.out.println("Birds Chirp");

    }

}

 class sparrow extends methodOverriding {
  //  public void chirp(){
   //     System.out.println("Sparrows Chirp");
   // }
}

 class parrot extends methodOverriding {
    public void chirp(){
        System.out.println("Parrots Chirp");
    }
}
class Main {
public static void main(String[] args) {
    methodOverriding obj1 = new methodOverriding();
    obj1.chirp();

    methodOverriding obj2 = new sparrow();
    obj2.chirp();

    methodOverriding obj3 = new parrot();
    obj3.chirp();
}
}