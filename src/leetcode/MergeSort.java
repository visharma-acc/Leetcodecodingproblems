package leetcode;

import java.util.HashMap;

public class MergeSort {
	
	public static int[] merge(int nums1[],int nums2[])
	{

	int n=nums1.length;
	int m=nums2.length;
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	
	int res[]=new int[n+m];
	
	int i=0,j=0,k=0;
	
	while(i<n && j<m)
	{
	  	if(nums1[i]<nums2[j])
	  	{
	  	  	res[k++]=nums1[i];
	  	  	i++;
	  	}
	  	else
	  	{
	  		res[k++]=nums2[j];
	  	  	j++;
	  	}
	}
	while(i<n)
	{
		res[k++]=nums1[i++];
	}
	while(j<m)
	{
		res[k++]=nums2[j++];
	}
	return res;
	}

	public static void main(String args[])
	{
		int nums1[] = {1};
		int nums2[] = {3};
		
		int res[]=merge(nums1,nums2);
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
		
	}
	
}
