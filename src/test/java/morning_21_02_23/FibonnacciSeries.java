package morning_21_02_23;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		int c=1;
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Fibonncci series=");
		for(int i=0;i<num;i++) 
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}
}
