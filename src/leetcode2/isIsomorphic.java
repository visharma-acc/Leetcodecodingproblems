package leetcode2;

import java.util.HashMap;
import java.util.HashSet;

public class isIsomorphic {
	
	public static void main(String[] args)
	{
		String s = "foo", t = "bar";
		HashMap<Character, Character> hm=new HashMap<Character, Character>();
		HashMap<Character, Character> hm1=new HashMap<Character, Character>();
		boolean flag=true;
		
		int i=0;
		while(i<s.length())
		{
			if(!hm.containsKey(s.charAt(i)))
			{
			   	hm.put(s.charAt(i), t.charAt(i));
			
			   
			}
			else
			{
				char tmp=hm.get(s.charAt(i));
				if(tmp==(t.charAt(i)))
				{}
				else
				{	
				flag=false;	
				 break;	
				}
				
			}
			
			if(!hm1.containsKey(t.charAt(i)))
			{
			   	hm1.put(t.charAt(i), s.charAt(i));
			
			   	
			}
			else
			{
				char tmp=hm1.get(t.charAt(i));
				if(tmp==(s.charAt(i)))
				{}
				else
				{	
				flag=false;	
				 break;	
				}
				
			}
			if(flag==true)
				i++;
			
			
			
		}
		
		System.out.println("string is ismorphic:"+flag);
		
	}

}
