package tester;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TransformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []words = {"gin","zen","gig","msg"};
		
		String [] code= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
		HashSet<String> hs=new HashSet<String>();
		
		StringBuilder builder=new StringBuilder();
		
		for(String s :words)
		{
			int  l=s.length();
			for(int i=0;i<l;i++)
			{
				int t=s.charAt(i)-97;
				builder.append(code[t]);
				//System.out.println(t);
			}
			hs.add(builder.toString());
			builder.setLength(0);
			
		
		}
		
		System.out.println(hs.size());

		String s = "abab";
		char c[]=s.toCharArray();
		int len=s.length();
		boolean flag=true;
		for(int i=0;i<len;i++)
		{
		  	if(c[i]=='b' && c[i+1]=='a')
		  	{
		  		flag=false;
		  	}
		}
		
		int nums []= {0,1,2,2,4,4,1};
		
		Arrays.sort(nums);
		int maxprime=0,c1=0, n=-1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0 && nums[i]==nums[i+1])
			{
				c1++;
			}
			else
			{	
			if(c1>maxprime)
			{
				if(n==-1)
				n=nums[i];
				maxprime=c1;
				c1=0;		
			}
			
			
			}	
		}
		
	}

}
