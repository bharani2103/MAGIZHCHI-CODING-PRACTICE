
package javaapplication23;

import java.util.Scanner;
public class JavaApplication23 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("enter the element :");
             arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<n;i++){
        if(arr[i]<largest){
        
          largest=arr[i];  
        }
        }
        System.out.println(largest);
        }
        
    }
    

