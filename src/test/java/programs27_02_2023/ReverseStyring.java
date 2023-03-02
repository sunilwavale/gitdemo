package programs27_02_2023;

public class ReverseStyring {

	public static void main(String[] args) 
	{
		String s="Automation is best";
		StringBuilder str=new StringBuilder();
		str.append(s);
		str=str.reverse();
		System.out.println(str);
	}
}
