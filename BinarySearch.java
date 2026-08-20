import java.util.Scanner;

class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[50];
        

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(a[mid] == key)
            {
                System.out.println("Element found");
                break;
            }
            else if(key > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }
}