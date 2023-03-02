package test;

public class Revstr {

	public static void main(String[] args) 
	{
		String str="abcdef";
		String[] parts=str.split("");
		
		for(int i=str.length()-1;i>0;i--) 
		{
			System.out.print(parts[i]+"");
		}
	}
}
