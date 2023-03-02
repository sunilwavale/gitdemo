package test;

public class Nonepeatedchar {
	
public static void main(String[] args) 
{
String s="aabbbccdded";
char[] ch=s.toCharArray();

for(char c:ch) 
{

	if(s.indexOf(c)==s.lastIndexOf(c)) 
	{
		System.out.println(c);
		break;
	}
}
	
}
}
