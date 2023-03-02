package morning_21_02_23;

public class NumberPlindrome {
	
	public static void main(String[] args) 
	{
		int num=123;
		int rev=0;
		int rem;
		int temp=num;
		
		while(temp!=0) 
		{
			rem=temp%10;// it will give reminder
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num) 
		{
			System.out.println("Number is Paindrome");
		}
		else
		{
			System.out.println("Number is not Paindrome");
		}
	}

}
