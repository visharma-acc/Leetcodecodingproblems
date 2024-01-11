package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums1[] = {1,2};
		int nums2[] = {3,4};
		
		ArrayList<Integer> l=new ArrayList<>();
		
		for(int i=0,j=0; i<nums1.length && j<nums2.length ;i++,j++)
		{
			if(i<nums1.length)
			   l.add(nums1[i]);
			if(j<nums2.length)
				l.add(nums2[j]);
		}
		
		Collections.sort(l);
		
		System.out.println(l);
		
		double med;
		
		if(l.size()%2==0)
		{
		  double l1=l.get(l.size()/2);
		  double l2=(l.get((l.size()/2)-1));
		 med=(l1+l2)/2;
		}
		else
		{
		 med=l.get(l.size()/2);
		}

		System.out.println("median is"+med);
		
	}

}
