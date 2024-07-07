import java.util.Scanner;
class pratice{
   public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of a =");
	    double a= sc.nextDouble();
		System.out.print("Enter value of b =");
		double b =sc.nextDouble();
		System.out.println("a+b ="+(a+b));
		System.out.println("a-b ="+(a-b));
		System.out.println("a*b ="+(a*b));
		System.out.println("a/b ="+(a/b));
		System.out.println("a%b ="+(a%b));
		System.out.println(~10);
		System.out.println(~(-10));
   }
}