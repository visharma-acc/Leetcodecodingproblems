package leetcode7;

import java.util.ArrayList;

public class LongestOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {0,0,0,0};
		int k=0;
		int k1=k;
		int t=0,j=0, max=0;
		int l=nums.length;
			
		for(int i=j;i<l-1;i++)
		{
		   if(nums[i]==0)
		   {
			   k--;
			   if(k>0)
			   t++;
		   }
		   else
		   {
			   t++;
		   }
		   if(k<=0 && nums[i+1]==0)
		   {
			   if(max<t)max=t;
			   System.out.println("t="+t); 
			   t=0;
			   j=j+1;
			   i=j;
			   k=k1;
			  System.out.println("max="+max); 
		   }
		   
		}
		System.out.println("-----------------------");
		System.out.println("last t"+t);
		if(nums[l-1]==1)t++;
		if(max<t)max=t;
		System.out.println("final max="+max); 
		
		
		
		
	
	

	}

}
