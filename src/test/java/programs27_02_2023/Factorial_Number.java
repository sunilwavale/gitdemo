package programs27_02_2023;

public class Factorial_Number {
public static void main(String[] args) 
{
	int num=5;
	int fact=1;
	
	for(int i=5;i>=1;i--) 
	{
		fact=fact*i;	
	}
	System.out.println(fact);
}
}
