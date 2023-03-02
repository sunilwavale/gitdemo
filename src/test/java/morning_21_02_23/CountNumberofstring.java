package morning_21_02_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberofstring {
	public static void main(String[] args) 
	{
		String s="life is beautiful enjoy it enjoy";
		String[] str=s.split(" ");
		Map<String,Integer>map=new HashMap();
		
		for(String st:str) 
		{
			if(!map.containsKey(st)) 
			{
				map.put(st, 1);
			}
			else 
			{
				int value=map.get(st);
				map.put(st, value+1);
				
			}
		}
		
		Set<String> a=map.keySet();
		for(String wrd:a) 
		{
			if(map.get(wrd)>1) 
			{
				System.out.print(wrd+":"+map.get(wrd));
			}
		}
	}

}
