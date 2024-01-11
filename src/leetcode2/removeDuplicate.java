package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java";
		
		char cj[]=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		ArrayList<Character> ar=new ArrayList<Character>();
		HashSet<Character>hs=new HashSet<Character>();
			
		
		
		for(char c:cj)
		{
			if(!hm.containsKey(c))
				hm.put(c, 1);
			else
			{
				int t=hm.get(c);
				hm.replace(c, t+1);
			}
			
		}
		

		for(char c:cj)
		{

			if(!ar.contains(c))
				ar.add(c);
			else
				hs.add(c);
			
		}
		

    ar.removeAll(hs);
    
    StringBuilder sn=new StringBuilder();
    
    char[] JavaCharArray = new char[4];

    char[] res=new char[ar.size()];
    
    for(char c:ar)
    {
    	sn.append(c);
    }
       

    
    
    System.out.println(ar);
    
    System.out.println(sn);
		

	}

}
