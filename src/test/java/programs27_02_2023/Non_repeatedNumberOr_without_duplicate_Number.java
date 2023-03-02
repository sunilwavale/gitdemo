package programs27_02_2023;

import java.util.Arrays;

public class Non_repeatedNumberOr_without_duplicate_Number {

	public static void main(String[] args) 
	{
		int[] a= {20,45,67,20,45,11,54};
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) 
		{
			int counter=0;
			for(int j=0; j<a.length; j++ ) 
			{
				if(a[i]==a[j])
				{
				counter++;
				}
				
			}
			if(counter==1) 
			{
				System.out.print(a[i]+" ");
			}
		}
		
	} 
}
