class Example
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5};
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	    for(int i=arr.length-2;i>=0;i--)
	    {
	        System.out.println(arr[i]);
	    }
	    for(int i:arr)
	    {
	        System.out.println(i);
	    }
	}
}