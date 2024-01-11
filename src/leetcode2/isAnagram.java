package leetcode2;

import java.util.HashMap;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram", t = "nagaram";
		
		int i=0;
		int c=0;
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		if(s.length()!=t.length())
			
		
		while(i<s.length())
		{
			c+=s.charAt(i)-t.charAt(i);
			i++;
		}
		
		while(i<s.length())
		{
			if(!hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i), 1);
			else
			{
				int tmp=hm.get(s.charAt(i));
				hm.replace(s.charAt(i), tmp+1);
				
			}
			
			i++;
		}
		
		i=0;
		
		while(i<t.length())
		{
			if(hm.containsKey(t.charAt(i)))
			{
				int tmp=hm.get(t.charAt(i));
				if(tmp==1)
					hm.remove(t.charAt(i));
				else
				  hm.replace(t.charAt(i), tmp-1);				
			}
			
			i++;
				
		}
			
		System.out.println(c);
		
		System.out.println(hm);
		
		

	}

}
