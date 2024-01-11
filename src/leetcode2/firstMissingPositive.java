package leetcode2;

import java.util.Arrays;

public class firstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {0,2,2,1,1};
		Arrays.sort(nums);
		boolean flag=false;
		int min=0 , res=0, i=0,c=0;
		

		for(int k=0;k<nums.length;k++)
		{
			if(nums[k]>0 && flag!=true)
			{
			   	min=nums[k];
			   	flag=true;
			   	
			}
		}	
		
		for(i=0;i<nums.length-1;i++)
		{
			if(nums[i]>0 && nums[i]+1!=nums[i+1])
			{
				c=nums[i]+1;
				break;
			}
			
			
		}
		
		if(c!=0 && min<c && flag==true)
		{
		  if(min!=1)
			  res=1;
		  else
			  res=c;
			
		}
		else
		{
			if(nums.length>1 &&  i==nums.length-1)
			{	
				if(min!=1)
					  res=1;
				  else
				    res=nums[i]+1;
				
			}	
			if(nums.length==1)
			{
				if(nums[0]>1)
					res=1;
				else if(nums[0]<=0)
					res=1;
				else
					res=nums[0]+1;
			}
			
				
		}
			
		
		
	System.out.println("min is "+min);
		
    System.out.println("c is "+c);
    
    System.out.println("firs missing no is "+res);
		
		
	}

}
