package programs27_02_2023;

public class Second_smallestNumber {
public static void main(String[] args) 
{
	int[] a= {10,67,23,17,2,7};
	
	int temp=0;
	
	for(int i=0; i<a.length; i++) 
	{
		for(int j=i+1;j<a.length; j++) 
		{
			if(a[i]>a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	System.out.print("Second smallest Number is="+a[1]);
}
}
