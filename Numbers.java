import java.util.Scanner;
class Numbers
{
	public static void main(String[] args)
	{
		Scanner number= new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=number.nextInt();
		if(n%2==0)
		{
			System.out.print("number is even ");
			
		}
		else 
		{
			System.out.print("number is odd ");
			
		}
	}
}