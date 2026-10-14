
package javaapplication30;
import java.util.Scanner;
public class JavaApplication30 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array element : ");
            a[i]=sc.nextInt();
            

        }
        
        
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
             b[i]=a[i];
            
           
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("original array : "+a[i]);
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("copies array : "+b[i]);
        }
    }
    
}
