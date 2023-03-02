package programs27_02_2023;

public class First_Repeatedchar {
	public static void main(String[] args) 
	{
		String s="aabbbddeff";
		char[] ch=s.toCharArray();
		
		for(char c:ch) 
		{
			if(s.indexOf(c)==s.lastIndexOf(c)) 
			{
				System.out.print("First Non Repeated char="+c);
			}
		}
	}
}
