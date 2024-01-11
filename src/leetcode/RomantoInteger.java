package leetcode;

import java.util.HashMap;

public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("I" , 1);
		hm.put("V" , 5);
		hm.put("X" , 10);
		hm.put("L" , 50);
		hm.put("C" , 100);
		hm.put("D" , 500);
		hm.put("M" , 1000);
		hm.put("CM" , 900);
		hm.put("CD" , 400);
		hm.put("XL" , 40);
		hm.put("XC" , 90);
		hm.put("IV" , 4);
		hm.put("IX" , 9);
		
	
		
		String s = "IV";
		int sum=0;
		int n=s.length();
		//System.out.println(s.substring(n-2, n));
		//System.out.println(hm.containsKey(s.substring(n-2, n)));
		
		for(int j=n;j>0;)
		{
		   if(j>=1)
		  {	
			
			if(j-2>=0)
			{	
		    String t=s.substring(j-2, j);
			System.out.println(t);
			if(hm.containsKey(t))
					{
				      System.out.println("inside if");
				       System.out.println(s.substring(j-2, j));
				       int temp=hm.get(s.substring(j-2, j));
				       System.out.println("temp="+temp);
				       sum+=temp;
				       j=j-2;
					}
			else
			{
				System.out.println("inside else");
				System.out.println(s.substring(j-1, j));
				int temp=hm.get(s.substring(j-1, j));
				System.out.println("temp="+temp);
				sum+=temp;
				j--;
			}
			}
			else
			{
				
				int temp=hm.get(s.substring(j-1, j));	
				sum+=temp;
				j--;
			}
			System.out.println("j="+j);
		}
	}
		
		
		System.out.println("sum="+sum);
		
		
	}

}
