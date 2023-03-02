package programs27_02_2023;

public class GivencharNumber {
public static void main(String[] args) 
{
	String s="java is javgggga again java again";
	
	char c='g';
	
	int count=s.length()-s.replace("g", "").length();
	System.out.println(count);
	}
}
