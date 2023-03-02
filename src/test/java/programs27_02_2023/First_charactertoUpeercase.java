package programs27_02_2023;

public class First_charactertoUpeercase {
public static void main(String[] args) 
{
	String s="life is beautiful enjoy it";
	String[] parts=s.split(" ");
	
	for(int i=0;i<parts.length;i++) 
	{
		char[] ch=parts[i].toCharArray();
		
		for(int j=0; j<ch.length;j++) 
		{
			ch[0]=Character.toUpperCase(ch[0]);
			System.out.print(ch[j]);
		}
		System.out.print(" ");
	}
	
	}
}
