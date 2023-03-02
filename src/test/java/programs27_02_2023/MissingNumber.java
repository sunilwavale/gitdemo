package programs27_02_2023;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) 
	{
		int[] a= {2,8,6,5,9,7,3};
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();             
		int first=a[0];
		System.out.println(first);
		
		for(int j=1;j<a.length;j++) 
		{
			if(a[j]==(first+1)) 
			{
				first=a[j];
				System.out.println(first);
			}
			else
			{
				System.out.println("Missing Number="+(first+1));
				break;
			}
		}
		
	}
}
