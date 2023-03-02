package programs27_02_2023;

public class Revstr {
	
	public static void main(String[] args) 
	{
		String str="my name is sunil wavale";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.print(rev);
	}

}
