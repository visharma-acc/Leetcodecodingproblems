package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int nums1[] = {1,2,2,1}, nums2[] = {2,2};
	
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	
	// {1,1,2,2}
	// {2,2}
		                 
	int i=0 ,j=0, k=0;
	
	
	//System.out.println("len="+len);
	ArrayList<Integer> ar=new ArrayList<Integer>();
	
   
	while(i<nums1.length && j<nums2.length)
	{
		if(nums1[i]==nums2[j])
		{
			//res[k]=nums1[i];
			ar.add(nums1[i]);
			i++;
			j++;
			k++;
		}
		else if(nums1[i]<nums2[j])
		{
			i++;
		}
		else
		{
			j++;
		}
	}
	
	int res[]=new int[k];
		
     
     
     for(int t=0;t<k;t++)
     {
    	 res[t]=ar.get(t);
    	 System.out.println(res[t]);
     }
	
	}

}
