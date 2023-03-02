package programs27_02_2023;

public class RevString {
public static void main(String[] args) 
{
	String s="level";
	String rev="";
	
	for(int i=s.length()-1; i>=0; i--) 
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(s)) 
	{
		System.out.println("Palindrome String");
	}
	else 
	{
		System.out.println("Not Palindrome");
	}
		
}
}