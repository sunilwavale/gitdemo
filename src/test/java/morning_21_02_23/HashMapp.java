package morning_21_02_23;

import java.util.HashMap;

public class HashMapp {
	
	public static void main(String[] args) 
	{
		HashMap<String,Integer>map=new HashMap();
		map.put("vishal",10);
		map.put("sachin", 40);
		map.put("sunil", 50);
		
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.entrySet());
		
		System.out.print(map.keySet());
		System.out.println(map.values());
		
		System.out.println("************");
		System.out.println(map.entrySet());
		System.out.print(map.remove("sachin"));
		
	}
}
