package programs27_02_2023;

import java.util.HashMap;
import java.util.Map;

public class Count_occurence_ofchar {
	
	public static void main(String[] args) 
	{
		String str="aaabbbbcccdddee";
		Map<Character,Integer>map=new HashMap();
		char[] ch=str.toCharArray();
		
		for(char a:ch) 
		{
		if(!map.containsKey(a)) 
		{
			map.put(a, 1);	
		}	
		else 
		{
			int value=map.get(a);
			map.put(a, value+1);
		}
		}
		System.out.println(map);
	}
}
