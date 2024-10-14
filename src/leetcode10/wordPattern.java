package leetcode10;

import java.util.HashMap;

public class wordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/word-pattern/
		String pattern = "abba";
		String s = "dog dog dog dog";
		
		String str[]=s.split(" ");
		HashMap<Character, String> hs=new HashMap<Character, String>();
		StringBuilder build=new StringBuilder();
		
		for(int i=0;i<pattern.length();i++)
		{
			System.out.println(pattern.charAt(i));
			if(!hs.containsKey(pattern.charAt(i)))
				hs.put(pattern.charAt(i), str[i]);
		}
		
		System.out.println(hs);
		
		for(int i=0;i<pattern.length() ;i++)
		{
			build.append(hs.get(pattern.charAt(i))).append(" ");
		}
		
		
		System.out.println(build.substring(0, s.length()));
		
		if(s.equals(build.substring(0, s.length())))
			System.out.println("pattern match");
		else
			System.out.println("pattern not a match");
	}

}
