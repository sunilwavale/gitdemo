package programs27_02_2023;

public class Prime_Number {
	
public static void main(String[] args) 
{
	int num=12;
	int temp=0;
	for(int i=2; i<num; i++)
	{
		if(num%i==0) 
		{
			temp=temp+1;
		}
	}
	
	if(temp>0)
	{
		System.out.println("Given Number is not Prime Number");
	}
	else
	{
		System.out.println("Given Number is Prime Number");
	}
}
}
