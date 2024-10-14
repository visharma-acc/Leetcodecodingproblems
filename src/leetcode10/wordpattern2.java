package leetcode10;

import java.util.HashMap;
import java.util.HashSet;

public class wordpattern2 {

	public static void main(String[] args) {
	String pattern = "aba";
	String s = "cat cat cat dog";
	
	String str[]=s.split(" ");
	HashMap<Character, String> hs=new HashMap<Character, String>();
	HashMap<String, Character> hs2=new HashMap<String, Character>();
	StringBuilder stringbuilder=new StringBuilder();
	StringBuilder patterbuilder=new StringBuilder();
	
	int loopcount=Math.min(pattern.length(), s.length());
	
	for(int i=0;i<loopcount;i++)
	{
		if(!hs.containsKey(pattern.charAt(i)))
		hs.put(pattern.charAt(i), str[i]);
		
		if(!hs2.containsKey(str[i]))
		hs2.put(str[i], pattern.charAt(i));
		
	}
	
	System.out.println(hs);
	System.out.println(hs2);
	
	for(int i=0;i<pattern.length();i++)
	{
		stringbuilder.append(hs.get(pattern.charAt(i))).append(" ");
	}
	
	for(int i=0;i<str.length;i++)
	{
		patterbuilder.append(hs2.get(str[i]));
	}
	
	
	System.out.println(patterbuilder.toString());
	System.out.println(stringbuilder.substring(0, s.length()));
	
	System.out.println(pattern.equals(patterbuilder));
	System.out.println(s.equals(stringbuilder.substring(0, s.length())));
	
	if(pattern.equals(patterbuilder.toString()) && s.equals(stringbuilder.substring(0, s.length())))
			System.out.println("pattern match");
	else
		System.out.println("pattern not a match");
		
	
	
	}
}