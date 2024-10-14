package leetcode14;

import java.util.Collections;
import java.util.HashMap;

public class frequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,3,1,3,2};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(!hm.containsKey(nums[i]))hm.put(nums[i], 1);
			else
			{
				int t=hm.get(nums[i]);
				hm.replace(nums[i],++t);
			}
		}
		System.out.println(hm);
		
		

	}

}
