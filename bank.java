package BasicsOfJava;
/*Imagine a scenario where you're building a banking application. Create a Java
program that models a basic bank account. Design a class for the account,
including methods for deposit, withdrawal, and checking the account balance.
Create instances of this class to demonstrate its functionality.
*/
import java.util.Scanner;
class Account{
    String AccNo;
    double balance;
    Account(String accNo,double balance){
        this.AccNo=accNo;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited Rs. "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void Withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Successfully withdrawn Rs. "+amount);
        }
        else{
            System.out.println("Insufficient fund");
        }
    }
    public void checkBalance(){
        System.out.println("Balance = Rs. "+balance);
    }
}
public class bank {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Account user= new Account("1",12000);
        int choice;
		System.out.println("Menu:");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawn");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        while(true){
            System.out.println("Enter your choice:");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter deposit amount ");
                    double amount=sc.nextDouble();
                    user.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter withdrawn amount");
                     amount= sc.nextDouble();
                    user.Withdraw(amount);
                    break;
                case 3:
                    user.checkBalance();
                    break;
                case 4:
                    System.out.println("Thanks for using banking application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
