package leetcode2;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[] = {0,2,3,4,6,8,9,11};
		int k=0,j=0;
		
		List<String> list=new ArrayList<String>();
		
//		for(int i=0;i<nums.length-1;i++)
//		{
//		   if(nums[i]==nums[i+1]-1)
//		   {
//			   //
//		   }
//		   else
//		   {
//			   k=i;
//			   System.out.println("range is "+nums[j]+"->"+nums[k]);
//			   j=i+1;
//		   }
//		   
//		  
//		}
		int i=0;
		
	
		
		for(i=0;i<nums.length-1;i++)
		{
		
		 if(nums[i]!=nums[i+1]-1)
		   {
			  k=i; 
			  System.out.println("range is "+nums[j]+"->"+nums[k]);  
			  if(j!=k)
			  list.add(nums[j]+"->"+nums[k]);
			  else
			  list.add("\"" +nums[j]+"\"");
			  j=i+1;
		   }
		}   
		
		if(j!=nums.length-1)
		list.add(+nums[j]+"->"+nums[nums.length-1]);
		else
		list.add("\"" +nums[j]+"\"");
		
		System.out.println("range is "+nums[j]+"->"+nums[nums.length-1]);   
		
		System.out.println(list);
		
		System.out.println(nums[i]);
		
	}
	

}
