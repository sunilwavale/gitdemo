package test;

import java.util.Arrays;

public class SortintArray {
	
	public static void main(String[] arg) 
	{
		int[] a= {40,10,76,23,19,24};
		int temp=0;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
