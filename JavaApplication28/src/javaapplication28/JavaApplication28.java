
package javaapplication28;
import java.util.Scanner;

public class JavaApplication28 {


    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.print("enter array size : ");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           System.out.print("enter array elements : ");
           a[i]=sc.nextInt();
       }

        for (int i = 0; i < n; i++) {
            int temp=0;
            temp=a[0];
            a[0]=a[n-1];
            a[n-1]=temp;
            System.out.println(a[i]);

           }

    }
    
}
