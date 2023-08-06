package BasicsOfJava;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       double marks1,marks2,marks3,marks4;
        System.out.print("Enter marks in math: ");
        marks1= sc.nextDouble();
        System.out.print("Enter marks in C++: ");
        marks2= sc.nextDouble();
        System.out.print("Enter marks in Java: ");
        marks3= sc.nextDouble();
        System.out.print("Enter marks in Data Structure:  ");
        marks4= sc.nextDouble();
        double percentages= (marks1+marks2+marks3+marks4)*100/240;
        System.out.println("Percentage :"+percentages);
    }
}
