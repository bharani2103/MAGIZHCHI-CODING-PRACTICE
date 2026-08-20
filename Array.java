import java.util.Scanner;

class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[50];
        

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}