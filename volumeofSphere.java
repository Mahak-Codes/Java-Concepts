package BasicsOfJava;
import java.util.Scanner;
public class volumeofSphere {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter radius of sphere: ");
        double radius= sc.nextDouble();
        double pi=3.1415;
        double volume =(4 * pi * radius * radius * radius)/3;
        System.out.println("The volume of sphere with radius "+radius+" is "+volume);
    }
}
