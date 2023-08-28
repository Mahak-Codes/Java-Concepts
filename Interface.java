package BasicsOfJava;

interface  Shape {
     void area();
    void perimeter();

}
class Triangle implements Shape{
    double a,b,c;
    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void area(){
        double s=(a+b+c)/2;
        double Area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle ="+ Area);
    }
    public void perimeter(){
        double p=a+b+c;
        System.out.println("Perimeter of triangle ="+ p);
    }
    public void display(){
        area();
        perimeter();
    }
}
class Rectangle implements Shape{
    double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        double Area=l*b;
        System.out.println("Area of rectangle ="+ Area);

    }
    public void perimeter(){
        double p=(l+b)*2;
        System.out.println("Perimeter of rectangle ="+ p);
    }
	public void display(){
        area();
        perimeter();
    }
}
class Circle implements Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }


    public void area() {
        double pi=3.14;
        double Area=pi*radius*radius;
        System.out.println("Area of Circle ="+ Area );
    }


    public void perimeter() {
        double pi=3.14;
        double p=pi*2*radius;
        System.out.println("Perimeter of rectangle ="+ p);
    }
	public void display(){
        area();
        perimeter();
    }
}
public class Interface{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3,4);
     	r1.display();
        Circle c1=new Circle(10);
		c1.display();
        Triangle t1=new Triangle(4,3,5);
        t1.display();

    }
}
