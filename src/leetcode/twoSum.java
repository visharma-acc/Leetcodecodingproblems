package leetcode;

import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {11,7,10,2};
		int target = 9;
		int res[]=new int[2];
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		for (int i=0; i<nums.length;i++)
		{
			hm.put(nums[i], i);
		}

		for(int i=0;i<nums.length;i++)
		{
			int temp=target-nums[i];
			if(hm.containsKey(temp) && hm.get(temp)!=i)
			{
				res[0]=i;
				res[1]=hm.get(temp);
				break;
			}
			
		}
		
		System.out.println(res[0]+" "+res[1]);
		
	}

}
