class  Newkeyword
{
	public static void main(String[] args)
	{
		int[] sample=new int [5];
		sample[0]=100;
		sample[1]=200;
		sample[2]=300;
		sample[3]=400;
		sample[4]=500;
		for(int i=sample.length-1;i>=0;i--)
		{
			System.out.println(sample[i]);
		}
	}
}