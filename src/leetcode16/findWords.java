package leetcode16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class findWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[] = {"Hello","Alaska","Dad","Peace"};
		ArrayList<String> list=new ArrayList<String>();
		
		HashSet<Character> hs1=new HashSet<Character>();
		Collections.addAll(hs1,'q','w','e','r','t','y','u','i','o','p');
		
		HashSet<Character> hs2=new HashSet<Character>();
		Collections.addAll(hs2,'a','s','d','f','g','h','j','k','l');
		
		HashSet<Character> hs3=new HashSet<Character>();
		Collections.addAll(hs3,'z','x','c','v','b','n','m');
		
		for(String str: words)
		{
			String str1=str.toLowerCase();
			char c=str1.charAt(0);
			if(hs1.contains(c))
			{
				int count=1;
				for(int i=1;i<str1.length();i++)
				{
				   if(hs1.contains(str1.charAt(i))) count++;	
				}
				if(count==str1.length()) list.add(str);
			}
			else if(hs2.contains(c))
			{
				int count=1;
				for(int i=1;i<str1.length();i++)
				{
				   if(hs2.contains(str1.charAt(i))) count++;	
				}
				if(count==str1.length()) list.add(str);
			}
			else
			{
				int count=1;
				for(int i=1;i<str1.length();i++)
				{
				   if(hs3.contains(str1.charAt(i))) count++;	
				}
				if(count==str1.length()) list.add(str);
				
			}
			
		}
		
	//	System.out.println(list);
		
		String[] findWords
        = list.stream().toArray(String[] ::new);
		
		

	}

}
