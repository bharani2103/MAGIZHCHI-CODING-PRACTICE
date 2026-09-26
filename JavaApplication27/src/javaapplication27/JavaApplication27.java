
package javaapplication27;
import java.util.Scanner;

public class JavaApplication27 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter elements : ");
            arr[i]=sc.nextInt();
        }
       for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                count++;
               
            }
            else{
                sum++;
               
            }
            
        }
       System.out.println("the negative number is : "+ count);
            
             System.out.println("the positive number is : " + sum);


    }
    
}
