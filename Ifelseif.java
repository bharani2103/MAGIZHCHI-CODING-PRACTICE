class Ifelseif
{
	public static void main(String[] args)
	{
		byte num=75;
		if(num>=90 && num<=100)
		{
			System.out.println("A grade");
		}
		else if(num>=75 && num<90)
		{
			System.out.println("B grade");
			
		}
		else if(num>=50 && num<75)
		{
			System.out.println("C grade");
			
		}
		else{
			System.out.println("fail");
			
		}
	}
}