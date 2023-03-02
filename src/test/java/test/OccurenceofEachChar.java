package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceofEachChar {
	public static void main(String[] args) 
	{
		String input="hhhhheeelloooo";
		Map<Character,Integer>map=new HashMap();
		
		char[] chars=input.toCharArray();
		
		for(char c:chars) 
		{
			if(!map.containsKey(c)) 
			{
				map.put(c, 1);
			}
			else 
			{
				int value=map.get(c);
				map.put(c,value+1);
			}
		}
		
		Set<Character>chars1=map.keySet();
		
		for(Character ch:chars1) 
		{
			if(map.get(ch)>1) 
			{
				System.out.println(ch+":"+map.get(ch));
			}
		}
		
}

	
}
