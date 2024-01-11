package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Solution4Sum {
	
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
		 
		// List<List<Integer>> list1=new ArrayList<>();
		 
		 List<List<Integer>> list1=new ArrayList<>();
		 
		 LinkedHashSet<ArrayList<Integer>> list=new LinkedHashSet<>();
		 
		 ArrayList<Integer> tmp;
		 LinkedHashSet<Integer> tmp1=new LinkedHashSet<Integer>();
		 
		 Arrays.sort(nums);
		 
		 for(int a=0; a<nums.length;a++)
		 {
			for(int b=a+1;b<nums.length;b++)
			{
				for(int c=b+1;c<nums.length;c++)
				{
					for(int d=c+1;d<nums.length;d++)
					{
						if((nums[a]+nums[b]+nums[c]+nums[d]==target) && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
						{
							int t=nums[a]+nums[b]+nums[c]+nums[d];
							System.out.println(t);
							System.out.println(target);
							if(t==target)
							System.out.println("inside if...........");
							tmp=new ArrayList<Integer>();
							tmp.add(nums[a]);
							tmp.add(nums[b]);
							tmp.add(nums[c]);
							tmp.add(nums[d]);
							list.add(tmp);
							System.out.println(tmp);
							System.out.println(list);
						}
							
					}
				}
			}
			 
		 }
		 System.out.println(list.size());
		 
		 list1.addAll(list);
		 
		 System.out.println(list);
		 System.out.println(list1);
		 
		 return list1; 
		 
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		int nums[] = {1000000000,1000000000,1000000000,1000000000} ;
		int target =-294967296;
		
		try
		{
			int t1=1000000000+1000000000+1000000000+1000000000;
			System.out.println("value of t is "+t1);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Exception occured");
		}
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		int c=0;
		LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			hs.add(nums[i]);
			if(!hm.containsKey(nums[i]))
			{
				System.out.println("inside if");
				hm.put(nums[i],1);
				c=c+1;
			}
			else
			{
				if(hm.get(nums[i])!=4)
				{
				System.out.println("inside else");
				int t=hm.get(nums[i]);
				hm.put(nums[i],t+1);
				c=c+1;
				}
				
			}
				
		}
		
		System.out.println(hm);
		int arr[]=new int[c];
		int k=0;
		
		for (Map.Entry<Integer,Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue() ); 
			 int t=entry.getValue();
			 while(t>0)
			 {
				 arr[k++]=entry.getKey();
				 t--;
			 }
			
		}
		
		System.out.println(arr.length);
		
		
         
		
		fourSum(arr,target);
		
		
		
	
		
	}

}
