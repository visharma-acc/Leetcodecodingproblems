package leetcode4;

import java.util.HashMap;

public class countBalls {
	
	public static int sumdigits(int num)
	{
		int sum=0;
		  while (num > 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }
	return sum;	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
		
		int lowLimit=5;
		int highLimit=15;
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		int maxballs=1;
		
		while(lowLimit<=highLimit)
		{
			int s=sumdigits(lowLimit);
			System.out.println("interger "+lowLimit+" Sum "+s );
			if(!hm.containsKey(s))
			{
			  hm.put(s, 1);	
			}
			else
			{
			 int t=hm.get(s);	
			 if(maxballs<=t) {maxballs=t+1;}
			 hm.replace(s, t+1); 	
			}
			lowLimit++;
		}

		System.out.println(hm);
		System.out.println(maxballs);
		
	}

}
