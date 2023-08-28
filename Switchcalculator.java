/*Write a Java program that takes user input for two numbers and an operator (+, -,
*, /). Implement a function using switch-case to perform the specified arithmetic
operation on the numbers and display the result.*/
package BasicsOfJava;
import java.util.Scanner;

public class Switchcalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a, b, result;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter your choice:");
        System.out.println("1.Addition ");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multiplication ");
        System.out.println("4.Division ");
        System.out.println("5.Modulus ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition:" + (a + b));
                break;
            case 2:
                System.out.println("Subtraction:" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication:" + (a * b));
                break;
            case 4:
                System.out.println("Division:" + (a / b));
                break;
            case 5:
                System.out.println("Modulo:" + (a % b));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
