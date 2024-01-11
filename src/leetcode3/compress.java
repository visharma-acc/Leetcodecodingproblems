package leetcode3;

import java.util.Stack;

public class compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char []chars = {'a','a','a','b','b','a','a'};
		

		
		Stack<Character> st=new Stack<>();
		//st.push('a');
		
		int c=0;
		int k=0;
		int l=chars.length;
		//System.out.println(l);
		
		int i;
		
		for(i=1;i<l;i++)
		{
			if(chars[i-1]==chars[i])
			{
				c++;
			}
			else
			{
				chars[k]=chars[i-1];
			//	System.out.println(chars[i-1]);
				c++;
			//	System.out.println(c);
				k++;
				if(c>1)
				{
					while(c>0)
					{
					  int t=c%10;	
					  char t2=(char)(t+48);
					  st.push(t2);
					  //chars[k++]=t2;
					  c=c/10;
					}
				}
				//System.out.println(st);
				c=0;
				while(!st.empty())
				{
					chars[k++]=st.pop();
				}
			}
			
			
		}
		
		chars[k]=chars[i-1];
		//System.out.println(chars[i-1]);
		c++;
		//System.out.println(c);
		k++;
		if(c>1)
		{
			while(c>0)
			{
			  int t=c%10;	
			  char t2=(char)(t+48);
			  st.push(t2); 
			  c=c/10;
			}
			
			while(!st.empty())
			{
				chars[k++]=st.pop();
			}
		}
		
		System.out.println("******************");
		//System.out.println(chars[k]);
		//System.out.println(c);	
		System.out.println(k);
		
		for(int a=0;a<k;a++)
		{
		  System.out.println(chars[a]);	
		}
		
		int n1 = 567382;
	//	n1=n1<<1;
	//	System.out.println(n1);
		
		int count=0;
		
		while(n1!=0)
		{
			n1=n1&(n1-1);
			count++;
			
		}
		
		System.out.println(count);
		
		
		
		
	}

}
