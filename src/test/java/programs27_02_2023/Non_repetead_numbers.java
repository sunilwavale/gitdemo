package programs27_02_2023;

public class Non_repetead_numbers {
	
	public static void main(String[] args) 
	{
		int[] a= {20,45,11,20,45,67,54};
		
		for(int i=0; i<a.length; i++) 
		{
			int counter=0;
			for(int j=0; j<a.length; j++) 
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
