package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class removeElement {
	
	public static int FindIndex(int  nums[],int val) {
		
		int first=0;
		int last=nums.length;
		int mid=-1,findex=-1;
		
		while(first!=last)
		{
			mid=(first+last)/2;
			if(nums[mid]==val)
			{
				findex=mid;
				while(nums[findex]==val)
				{
					if(findex>0 && nums[findex-1]==val)
					findex--;
					else
					 break;	
				}
				break;
			}	
			else if(nums[mid]>val)
				last=mid-1;
			else
				first=mid+1;
		}
		
		
		
		return findex;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {3,3};
		int val = 3;
		int l=nums.length;
		int c=0;

		
	    Arrays.sort(nums);
	    int index=FindIndex(nums, val);
	    System.out.println("index is "+index);
	    
	    for(int i=0;i<nums.length;i++)
	    {
	    	System.out.println(nums[i]);
	    }
	    
	    while(nums[index]==val)
	    {
	    	System.out.println("inside while");
	    	nums[index]=nums[--l];
	    	c++;
	    	if(index!=nums.length-1)
	    	  index++;
	    	else
	    	 break;	
	    }
	    
	    System.out.println("arr element "+(nums.length-c));
	 //   System.out.println(nums);
	    
	    for(int i=0;i<nums.length;i++)
	    {
	    	System.out.println(nums[i]);
	    }
	    
	    
	    HashMap<String, Integer> map = new HashMap<>();
	    
        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
  
        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());

	}

}
