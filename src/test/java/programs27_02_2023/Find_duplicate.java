package programs27_02_2023;

import java.util.HashSet;

public class Find_duplicate {

	public static void main(String[] args) 
	{
		int[] a= {5,90,67,32,42,32,40};
		HashSet hs=new HashSet();
		
		for(int no:a) 
		{
			if(hs.add(no)==true) 
			{
				System.out.print(no+" ");;
			}
		}
		
	}
}
