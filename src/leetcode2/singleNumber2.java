package leetcode2;

import java.util.HashMap;

public class singleNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {0,1,0,1,0,1,99};
		
	   int sum=0;
		
		for(int i=0;i<nums.length;i++)
		{
		 
			sum=sum+nums[i];
		 	 
		}
		
		int c=sum%3;
		
		System.out.println("sums is"+sum);
		System.out.println("answer is "+c);
		
	
		
		
		
		
		
	}

}
