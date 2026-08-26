class Sort
{
	public static void main(String[] args)
	{
		int arr[]={10,35,8,13,98};
		System.out.println("before sorting : "+arr[]);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.print(arr[i]);
			}
			else
			{
				arr[i]=arr[i+1];
				System.out.print(arr[i]);
			}
		}
	}
}