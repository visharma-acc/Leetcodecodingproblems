package leetcode5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CountPairsWhoseSumisLessthanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
		
	 List<Integer>	nums =  Arrays.asList(-1,1,2,3,1); 
	 int target = 2;
	 
	Collections.sort(nums);
	int total=0;
	
	System.out.println(nums);
	int i=0 , j=nums.size()-1;
	while (i<j)
	{
		System.out.println(nums.get(i)+" "+nums.get(j));
		if(nums.get(i) +nums.get(j)<target)
		{
			System.out.println(nums.get(i)+" "+nums.get(j));
			total=total+(j-i);
			System.out.println(total);
			i++;
		}
		else
		{
			j--;
			if(i==j) break;
				
		}
		
	}
		
	System.out.println("<<<<<>>>>>>>>>>");
	System.out.println(total);

	}

}
