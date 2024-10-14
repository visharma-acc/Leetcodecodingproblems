package leetcode9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class findIntersectionValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {4,3,2,3,1};
		int nums2[] = {2,2,5,2,3,6};
		int res[]= {0,0};
		
		int count=0;
		
		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					count++;
					break;
				}
			}
		}
		
		res[0]=count;
		count=0;
		
		for(int i=0;i<nums2.length;i++)
		{
			for(int j=0;j<nums1.length;j++)
			{
				if(nums2[i]==nums1[j])
				{
					count++;
					break;
				}
			}
		}
		
		res[1]=count;

		System.out.println(res[0]+" "+res[1]);
	}

}
