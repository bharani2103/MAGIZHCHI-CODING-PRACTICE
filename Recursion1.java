class Recursion1
{
	public static void main(String[] args)
	{
		Recursion1 r=new Recursion1();
		 r.change(10);
	}
	int change(int count)
	{
		if(count>=0)
		{
		System.out.println(count);
		 change( count-1);
		}
		return -1;
		
	}
}