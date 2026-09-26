
package javaapplication22;

import java.util.Scanner;


public class JavaApplication22 {


    public static void main(String[] args) {
       
        

    Scanner sc=new Scanner(System.in);
    System.out.print("enter an element : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int sum=0;
    int average=0;
    for(int i=0; i<n; i++)
    {
        
        System.out.print("enter a element "+i+" : ");
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
        System.out.println(sum);
        average=sum/n;
        System.out.println(average);
//        for (int i = 0; i < n; i++) {
//            System.out.println();
//        }
   
    
         
    
    }
 
}

    
    

