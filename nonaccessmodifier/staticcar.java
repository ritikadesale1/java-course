package nonaccessmodifier;

public class staticcar {    
    int Mileage=15;
    int Price=100000000;
    String Color="Black";
    static void model_info()
    {
        System.out.println("Model: BMW");
    }
public void car_info()
{
    System.out.println("Color: " + Color + " black");
    System.out.println("Price: " + Price + " INR");
    System.out.println("Mileage: " + Mileage + " km/l");
}
public static void main(String[] args) {
    model_info();
    staticcar obj=new staticcar();
    obj.car_info();
}
}
