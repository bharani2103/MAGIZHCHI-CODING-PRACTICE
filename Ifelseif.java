class Ifelseif
{
	public static void main(String[] args)
	{
		byte num=85;
		if(num>=85 && num<=100)
		{
			System.out.println("your number is between 85 to 100");
		}
		else if(num>=50 && num<85)
		{
			System.out.println("your number is between 50 to 85");
			
		}
		else 
		{
			System.out.println("you entered a number which is less than 50");
			
		}
	}
}