package programs27_02_2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountofString {
	public static void main(String[] args) 
	{
		String s="life it it is beautiful enjoy it enjoy";
		Map<String,Integer>map=new HashMap();
		String[] str=s.split(" ");
		
		for(String st:str) 
		{
			if(!map.containsKey(st)) 
			{
				map.put(st,1);
			}
			else
			{
				int value=map.get(st);
				map.put(st,value+1);
			}
		}
		Set<String>strkeys=map.keySet();
		
		for(String st1:strkeys) 
		{
			if(map.get(st1)>1) 
			{
				System.out.println(st1+":"+map.get(st1));
			}
		}
	}

}
