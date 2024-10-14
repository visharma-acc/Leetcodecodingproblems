package leetcode14;

import java.util.ArrayList;
import java.util.HashSet;

public class twoOutOfThree {
	
	public static int [] getFreq(int []nums)
	{
		int [] arr =new int[101];
		for(int i=0;i<nums.length;i++)	
		{
		 	arr[nums[i]]=1;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {1,2,3};
		int []nums2 = {1,2,3,4,5,6,7};
		int []nums3 = {4,5,6,7};
		int [] arr1 =new int[101];
		int [] arr2 =new int[101];
		int [] arr3 =new int[101];
		
   
		
		ArrayList<Integer> list=new ArrayList<>();
	
		arr1=getFreq(nums1);
		arr2=getFreq(nums2);
		arr3=getFreq(nums3);
		
		for(int i=0;i<101;i++)	
		{
		 	if(arr1[i]+arr2[i]+arr3[i]>1)
		 		list.add(i);
		}
		
		
		System.out.println(list);
	}

}
