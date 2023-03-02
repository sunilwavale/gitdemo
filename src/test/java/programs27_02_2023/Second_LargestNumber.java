package programs27_02_2023;

public class Second_LargestNumber {
	public static void main(String[] args) 
	{
		int[] a= {10,6,19,12,90,78,99,45};
		int temp=0;
		
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Second Largest Number="+a[1]);
	}

}
