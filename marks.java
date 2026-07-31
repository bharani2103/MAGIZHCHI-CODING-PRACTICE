class Marks
{
	public static void main(String[] args)
	{
		int mark1=80;
		int mark2=90;
		int mark3=70;
		int total=mark1+mark2+mark3;
		int average=((mark1+mark2+mark3)/3);
		boolean result=((mark2>mark1)&&(mark2<mark3));
		System.out.println("total="+total);
		System.out.println("average="+average);
		System.out.println("result is "+result);
	}
}