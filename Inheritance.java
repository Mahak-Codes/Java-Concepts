package BasicsOfJava;
/*Design a class hierarchy for different types of vehicles: Vehicle as the base class,
and subclasses Car, Motorcycle, and Truck. Include attributes like make, model,
and year. Each subclass should have specific attributes and methods that
showcase inheritance. Demonstrate creating instances of each subclass and
accessing their attributes and methods*/
import java.util.Scanner;
class Vehicle{
    String make,model;
    int year;
    public Vehicle(String m,String m1,int y){
        this.make=m;
        this.model=m1;
        this.year=y;
    }
    public void VehicleInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model :"+model);
        System.out.println("Year : "+year);
    }
}
class Car extends Vehicle{
    int seats;
    public Car(String make,String model,int y,int n ){
        super(make,model,y);
        this.seats=n;
    }
    void CarInfo(){
        super.VehicleInfo();
        System.out.println("No. of seats ="+seats);
    }
}
class Motorcycle extends Vehicle{
    String type;
    Motorcycle(String m,String m1,int y,String t){
        super(m,m1,y);
        this.type=t;
    }
    void MotorcycleInfo(){
        super.VehicleInfo();
        System.out.println("Type :"+type);
    }
}
class Truck extends Vehicle{
    int capacity;
    Truck(String m,String m1,int y,int c){
        super(m,m1,y);
        this.capacity=c;
    }
    void TruckInfo(){
        super.VehicleInfo();
        System.out.println("Capacity :"+capacity);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Car Information: ");
        Car c1=new Car("Toyota", "Camry", 2022, 5);
        c1.CarInfo();
        System.out.println("Motorcycle Information: ");
        Motorcycle m1=new Motorcycle("Honda", "CBR500R", 2021, "Sport");
        m1.MotorcycleInfo();
        System.out.println("Truck Information: ");
        Truck t1=new Truck("Ford", "F-150", 2020, 2);
        t1.TruckInfo();

    }
}
