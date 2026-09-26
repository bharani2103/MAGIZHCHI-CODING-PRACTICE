
package javaapplication25;
import java.util.Scanner;

public class JavaApplication25 {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter number of elements : ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       int sum=0;
       int average=0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter elements : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
            average=sum/n;
            }
        System.out.println("the total is :" + sum);
        System.out.println("the average is : " + average);

    }
    
}
