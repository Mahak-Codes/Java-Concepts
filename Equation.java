import java.util.Scanner;
public class Equation{
 public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   System.out.println("Enter value of a =");
   double a=input.nextDouble();
   System.out.println("Enter value of b= ");
   double b=input.nextDouble();
   System.out.println("Enter value of c=");
   double c=input.nextDouble();
   double d= b*b -(4.0*a*c);
   if(d>0.0){
    double r1= (-b+Math.pow(d,0.5))/2.0*a;
    double r2=(-b-Math.pow(d,0.5))/2.0*a    ;
    System.out.println("The root are "+ r1+" and " +r2);
   }
   else if(d==0.0){
   double r1=-b/(2.0*a);
   System.out.println("The both roots are same = "+r1);
  }
  else{
    System.out.println("No real roots");
  }
}
}
