package test;

public class RemovingDuplicatechar {
	//comparing each characterwith other and if it finds same print that
	public static void main(String[] args) 
	{
		String str="myyyynaaaammmmeeissuuunilr";
		
		
		String newstr="";
		char prevchar=' ';
		
		
		for(int i=0;i<str.length()-1;i++) 
		{
			if(prevchar!=str.charAt(i)) 
			{
				newstr=newstr+str.charAt(i);
				prevchar=str.charAt(i);
			}
		}
		
		System.out.println(newstr);
	}}

