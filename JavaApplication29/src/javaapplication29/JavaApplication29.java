
package javaapplication29;
import java.util.Scanner;
public class JavaApplication29 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first array size : ");
    int n=sc.nextInt();
    int a[]=new int[n];
        for (int i = 0; i < n; i++) {
        System.out.print("enter first array element : ");   
        a[i]=sc.nextInt();
        }
    System.out.print("enter the second array size : ");
    int m=sc.nextInt();
    int b[]=new int[m];
        for (int i = 0; i < n; i++) {
        System.out.print("enter second array element : ");   
        b[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            if(a[i]==b[j])
            {
                System.out.println("common elements : "+a[i]);
            }
           
            }
            
           
            
        }
    }
    
}
