import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array a=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
           // System.out.print(" ");
        }


    }

   
}