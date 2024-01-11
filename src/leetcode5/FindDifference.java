package leetcode5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindDifference {
	
	public static void main(String[] args) {
	
		int []nums1 = {-68,-80,-19,-94,82,21,-43};
		int nums2[] = {-63};
		 
		 HashSet<Integer> hs1=new HashSet<>();
		 HashSet<Integer> hs2=new HashSet<>();
		 HashSet<Integer> hs3=new HashSet<>();
		
		for (int i=0,j=0;i<nums1.length||j<nums2.length;i++,j++)
		{

			if(i<nums1.length)hs1.add(nums1[i]);
			if(j<nums2.length)hs2.add(nums2[j]);
		}
		
		 hs3.addAll(hs1);
		
		List<List<Integer>> list =new ArrayList<>();
		hs1.removeAll(hs2);
		hs2.removeAll(hs3);
	
		
		list.add(new ArrayList<>(hs1));
		list.add(new ArrayList<>(hs2));
		
	   System.out.println(list);			
	
	}
	

}
