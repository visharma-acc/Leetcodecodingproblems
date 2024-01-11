package leetcode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class makeGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "leEeetcode";
		
		ArrayList<Character> ls=new ArrayList<Character>();
			
		for(int i=0;i<s.length();i++)
		{
			ls.add(s.charAt(i));
		}
		
		int l=ls.size();
		int i=0;
		int top=-1;
		while(i+1<l)
		{
			if(ls.get(i)==ls.get(i+1)-32 || ls.get(i)==ls.get(i+1)+32)
			{
				ls.remove(i+1);
				ls.remove(i);
			}
			
			System.out.println(ls);
			
			if(l>ls.size())
			{
				i=0;
				l=ls.size();
				System.out.println("inside if");
			}
			else
			{	
			
				System.out.println("inside else");	
			    i++;
			
			}
			
			System.out.println(i);
			
				
		}
		
		
		StringBuilder str=new StringBuilder();
		for(int k=0;k<ls.size();k++)
		{
			str.append(ls.get(k));
		}
		
		System.out.println(str.toString());

	}

}
