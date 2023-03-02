package programs27_02_2023;

import java.util.Arrays;

public class Common_Elements {
public static void main(String[] args) 
{
	int[] a= {4,5,1,80,45,86,90,87};
	int[] b= {4,5,65,80};
	Arrays.sort(a);
	Arrays.sort(b);
	
	for(int i=0; i<a.length; i++) 
	{
		for(int j=0;j<b.length; j++) 
		{
			if(a[i]==b[j]) 
			{
			System.out.print(a[i]+" ");
			
		}
		}
	}
}
}
