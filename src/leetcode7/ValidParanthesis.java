package leetcode7;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "]";
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(') st.add(s.charAt(i));
			if(s.charAt(i)=='[') st.add(s.charAt(i));
			if(s.charAt(i)=='{') st.add(s.charAt(i));
			if(s.charAt(i)==')')
			{
				if(st.size()>0 && st.peek()=='(') st.pop();
				else st.add(s.charAt(i));
					
			
			}
			if(s.charAt(i)==']')
			{
				if(st.size()>0 && st.peek()=='[') st.pop();
				else st.add(s.charAt(i));
			
			}
			if(s.charAt(i)=='}')
			{
				if(st.size()>0 && st.peek()=='{') st.pop();
				else st.add(s.charAt(i));
				
			}
		}
		
		if(st.size()==0)
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println(st);

	}

}
