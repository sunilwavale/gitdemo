package test;

import java.util.Arrays;



public class Anagram {
	public static void main(String[] args) 
	{
		String s1="pek";
		String s2="keep";
		
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		boolean result = Arrays.equals(str1, str2);
		
		if(result==true)
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
	}
}
