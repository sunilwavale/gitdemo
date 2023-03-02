package test;

public class PrimeNumber {
public static void main(String[] args) 
{
	int num=10;
	int temp=0;
	for(int i=2;i<7;i++ ) 
	{
		if(num%i==0) 
		{
			temp=temp+1;
		}
	}
	if(temp==0) 
	{
		System.out.println(" Prime");
	}
	else 
	{
		System.out.println(" Not Prime");	
	}
}
}
