import java.util.Scanner;
public class Calculator{
 public static void main(String args[]){
  Scanner input= new Scanner(System.in);
  System.out.print("Enter value of a =");
  double a= input.nextDouble();
  System.out.print("Enter value of b =");
  double b= input.nextDouble();
  System.out.println("a+b="+(a+b));
  System.out.println("a-b="+(a-b));
  System.out.println("a/b="+(a/b));
  System.out.println("a*b="+(a*b));
  System.out.println("a%b="+(a%b));
}
}
