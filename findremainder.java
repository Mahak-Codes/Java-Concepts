package BasicsOfJava;
import java.util.Scanner;
public class findremainder {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int  a= sc.nextInt();
        System.out.print("Enter divisor: ");
        int b= sc.nextInt();
        int q=  a/b;
        int remainder=a-b*q;
        System.out.println("When "+a+"  is divided with "+b+" the remainder is : "+remainder);// using mathematical logic
        System.out.println("When "+a+"  is divided with "+b+" the remainder is : "+ a%b);//using modulo operator
    }
}
