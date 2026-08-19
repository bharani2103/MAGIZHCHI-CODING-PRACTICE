class Sample1
{
	public static void main(String[] args)
	{
		int a=100;
		
		Sample1 s=new Sample1();
		s.Num(a);
		System.out.println("After changing: "+a);
		
		
		
	}
	int Num(int a)
	{
		a=1000;
		System.out.println("Inside the function : "+a);
		
		return a;
	}
}