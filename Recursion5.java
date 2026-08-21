class Recursion5
{
	public static void main(String[] args)
	{
			int arr[]={10,20,30,40,50};
			int key=30;
			Recursion5 r=new Recursion5();
			int result=r.element(arr,0,key);
			System.out.println(result);
	}
	int element(int arr[], int index, int key)
	{
		if(arr[index]==arr.length)
		{
			return -1;
		}
		if(arr[index]==key)
		{
			return index;
		}
		return element( arr,  index+1,  key);
	}
}