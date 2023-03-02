package interview_Programs;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		int num=8;
		int temp=0;
		for(int i=2; i<num; i++) 
		{
			if(num%i==0) 
			{
			temp=temp+1;	
			}
			
		}
		if(temp>1) 
		{
			System.out.println("Not A Prime");
		}
		else 
		{
			System.out.println("Prime");	
		}
	}

}
