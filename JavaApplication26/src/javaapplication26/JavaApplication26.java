
package javaapplication26;
import java.util.Scanner;

public class JavaApplication26 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number of elements : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter elements : ");
            arr[i]=sc.nextInt();
            
        }
        int smallest=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<smallest)
            {
              smallest=arr[i];
              
            }
            
            
        }
        System.out.println("the smallest number is : " + smallest);
            
    }
    
}
