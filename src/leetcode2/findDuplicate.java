package leetcode2;

import java.util.Arrays;
import java.util.HashSet;

public class findDuplicate {
	
	public static void main(String[] args) {
		
		int []nums = {2,2,2,2,2};
		
		System.out.println(nums.length);
		int res=0;

        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(hs.contains(nums[i]))
        	{
        		res=nums[i];
        		break;
        	}
        	else
        	{
        		hs.add(nums[i]);
        	}
        }

        System.out.println(res);
		
        
	}

}
