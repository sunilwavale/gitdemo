package test;

public class Binarystring {
	public static void main(String[] args) 
	{
		String s1="10010001";
		String s2="11000011";
		//          11010011
		
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		
		for(int i=0; i<str1.length;i++) 
		{
			
			
				if(str1[i]=='1' || str2[i]=='1') 
				{
					System.out.print("1");
				}
				
				else 
				{
					System.out.print("0");
				}
		}
		
	}
}
