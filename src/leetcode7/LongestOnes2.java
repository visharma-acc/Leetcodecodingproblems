package leetcode7;

import java.util.ArrayList;

public class LongestOnes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k=2,k1=k;
		int t=0, max=0;
		int l=nums.length;
		
		for(int i=0;i<l;i++)
		{
		  int j=i;	
		  while(k>0 || nums[j]!=0)
		  {
			  if(nums[j]==0)
			  {
				  k--;
				  t++;
			  }
			  else
			  {
				  t++;
			  }
			  j++;
			  if(j==l)break;
		  }
		  System.out.println("t="+t);
		  if(t>max)max=t;
		  k=k1;
		  t=0;
		  System.out.println(max);
		}

	}

}
