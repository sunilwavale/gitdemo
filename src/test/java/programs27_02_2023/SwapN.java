package programs27_02_2023;

public class SwapN {
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A="+a);
		System.out.println("B="+b);
	}

}
