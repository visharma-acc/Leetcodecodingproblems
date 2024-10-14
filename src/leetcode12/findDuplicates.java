package leetcode12;

import java.util.ArrayList;

public class findDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {4,3,2,7,8,2,3,1};
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			
			int index= Math.abs((nums[i]))-1;
			if(nums[index]<0) list.add(Math.abs((nums[i])));
			nums[index]=nums[index]*-1;
		}
		
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]);
		
		System.out.println(list);
		
	}

}
