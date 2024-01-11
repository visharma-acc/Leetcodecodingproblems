package leetcode2;

import java.util.Arrays;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=-1;

		int []nums = {3,0,1};
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=i)	
			{
				c=i;
				break;
			}
		}
		
		if(c==-1)
			c=nums.length;
		
		System.out.println(c);
		
	}

}
