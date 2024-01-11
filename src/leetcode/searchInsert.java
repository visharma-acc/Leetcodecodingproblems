package leetcode;

public class searchInsert {
	
	public static void main(String args[])
	{
		
		int []nums = {1,3,5,6};
		int target = 5;
		int j=0;
		
		for (int i=0;i<nums.length;i++)
		{
			if(nums[i]==target ||nums[i]>target)
			{
				break;
			}
			
			j++;
		}
		
		System.out.println("insert position is "+j);
		
		
	}

}
