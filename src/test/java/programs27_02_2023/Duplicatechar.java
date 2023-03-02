package programs27_02_2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatechar {
	public static void main(String[] args) 
	{
		String str="hellokkjkkjk";
		Map<Character,Integer>map=new HashMap();
		char[] chars=str.toCharArray();
		
		for(char ch:chars) 
		{
			if(!map.containsKey(ch)) 
			{
				map.put(ch, 1);
			}
			else
			{
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		
		Set<Character>a=map.keySet();
	for(Character chr:a) 
	{
		if(map.get(chr)>1) 
		{
			System.out.println(chr+":"+map.get(chr));
		}
	}
	}

}
