
package javaapplication24;
import java.util.Scanner;

public class JavaApplication24 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("the even nnumber is : "+arr[i]);
            }
            else{
                System.out.println("the odd number is "+arr[i]);
            }
        }
    }
    
}
