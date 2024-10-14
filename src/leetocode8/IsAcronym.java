package leetocode8;

import java.util.ArrayList;
import java.util.List;

public class IsAcronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
		List<String> words= new ArrayList<>(); 
		words.add("an");
		words.add("apple");
		String s="a";
		int len=words.size();
		char [] st=new char[len];
		int i=0;
		for(String str: words)
		{
			st[i++]=str.charAt(0);
		}
		if(new String(st).equals(s))
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
