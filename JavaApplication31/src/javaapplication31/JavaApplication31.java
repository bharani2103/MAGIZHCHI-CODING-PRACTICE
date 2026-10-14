
package javaapplication31;
import java.util.Scanner;

public class JavaApplication31 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the elements : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int key=35;
        for (int i = 0; i < n; i++) {
                             System.out.print("enter array values : ");

            a[i]=sc.nextInt();

          }  
        for (int i = 0; i <n; i++) {
             
           int temp=0;    
           temp=a[i]+a[i+1];
           if(temp==key){
               System.out.println(key);
           }
        }
        }
    }
    

