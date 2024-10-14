package leetcode9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import leetcode2.complement;

public class findDisappearedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,3,2,7,8,2,3,1};
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<nums.length;i++)
		{
		 hs.add(i+1);  	
		}
		
		for(int i=0;i<nums.length;i++)
		{
		  	hs.remove(nums[i]);
		}
	
		
		System.out.println(hs);
		System.out.println(new ArrayList<>(hs));
		
	
	}

}
