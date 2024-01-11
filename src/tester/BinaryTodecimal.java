package tester;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BinaryTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {1,0,1};
		
		int t=6;
		
		int m=(t/2)+1;
		
		System.out.println(m);
		
		int i=0;
		int n=0;
		StringBuilder s=new StringBuilder();
		while(i<nums.length)
		{
			
			s.append(nums[i]);
			i++;
		}
		
		
				
		int val=Integer.parseInt(s.toString(), 2);
		
		System.out.println(val );
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		if(!hs.contains(1))
		{}
		
	}

}
