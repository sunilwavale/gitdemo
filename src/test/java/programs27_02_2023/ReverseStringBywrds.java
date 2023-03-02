package programs27_02_2023;

public class ReverseStringBywrds {
	
	public static void main(String[] args) 
	{
		String s="Life is beautiful enjoy it";
		String[] str=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) 
		{
			System.out.print(str[i]+" ");
		}
	}

}
