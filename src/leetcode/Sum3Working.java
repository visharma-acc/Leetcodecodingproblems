package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int nums[]= {0,0,0};
		Arrays.sort(nums);
		
		Set<List<Integer>> list=new HashSet<>();
		
		for(int i=0;i<nums.length-2;i++)
		{
			int j=i+1;
			int k=nums.length-1;
			while(j<k)
			{
				if(nums[i]+nums[j]+nums[k]==0)
				{
					list.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
				
				}
				else if(nums[i]+nums[j]+nums[k]>0)
				{
					k--;
				}
				else
				{
					j++;
				}
			}
			
		
			
		}
		List<List<Integer>> l=new ArrayList<List<Integer>>();
		l.addAll(list);
		
		System.out.println(list);	
		
	}		
	
}
