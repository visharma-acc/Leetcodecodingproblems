package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {0,1,2,3,4,5};
		int target=5;
		
		Arrays.sort(nums);
		int l=nums.length-1;
		
		
		
		for(int i=0;i<l;)
		{
		//	System.out.println("i="+i+" j="+l);
			if(nums[i]+nums[l]==target)
			{
				System.out.println(nums[i]+" "+nums[l]);
				i++;
				l--;
			}
			
			else if(nums[i]+nums[l]>target)
			{
				l--;
			}
			else
			{
				i++;
			}
			
		}
		
		System.out.println("-----------------------------------------");
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			hm.put(nums[i], i);
		}
		
	
		
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j && nums[i]+nums[j]== target && i<j)
				{
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
		
	}

}
