package leetcode3;

import java.util.HashMap;
import java.util.HashSet;

public class checkIfExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {0,0};	
		boolean flag=false;
		
		HashSet<Float> hs=new HashSet<>();
		int c=0;
		
		for(int n:arr)
		{
			if(n==0)
				c++;
			hs.add((float)n);
		}	
		
		for(int n:arr)
		{	
			float t=n/2;
			System.out.println(t);
			if(hs.contains((float)n/2))
			{flag=true;
			break;}
		}	
		
		System.out.println(hs);
		
		System.out.println(flag);
		

	}

}
