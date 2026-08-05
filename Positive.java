import java.util.Scanner;
class Positive
{
	public static void main(String[] args)
	{
		Scanner number= new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=number.nextInt();
		if(n>=0)
		{
			System.out.print("number is positive ");
			
		}
		else 
		{
			System.out.print("number is negative ");
			
		}
	}
}