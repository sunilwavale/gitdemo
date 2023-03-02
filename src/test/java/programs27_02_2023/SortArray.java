package programs27_02_2023;

public class SortArray {
public static void main(String[] args) 
{
	int[] a= {6,9,2,10,16,90,45,78};
	int temp=0;
	
	for(int i=0; i<a.length;i++) 
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
		System.out.print(a[i]+" ");
	}
	for(int i=a.length-1; i>=0;i--) 
	{
		System.out.print(a[i]+" ");
	}
}
}
