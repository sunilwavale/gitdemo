package morning_21_02_23;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {
	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();
		arr.add("A");
		arr.add(10);
		arr.add(12.2f);
		arr.add('c');
		arr.add("A");
		
		System.out.print(arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.isEmpty());
		System.out.println(arr.indexOf("A"));
		System.out.println(arr.lastIndexOf("A"));
		
		arr.add(1,1234);
		arr.remove(4);
		arr.set(3, "sunil");
		System.out.println(arr);
		
		Iterator itr=arr.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+" ");
		}
		System.out.print("******");
		for(Object arobj:arr) 
		{
			System.out.print(arobj+" , ");
		}
		
		for(int i=0; i<arr.size();i++) 
		{
			System.out.print(arr.get(i)+" ,, ");
		}
	}

}
