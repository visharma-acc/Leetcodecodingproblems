package leetcode5;

public class leftRightDifference {
	
	public static int leftsum(int []nums , int index )
	{int total=0;
		for (int i=0;i<index;i++)
		{
			total=total+nums[i];
		}
		return total;
	}
	
	public static int rightsum(int []nums , int index)
	{
		int total=0;
		for (int i=index+1;i<nums.length;i++)
		{
			total=total+nums[i];
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://leetcode.com/problems/left-and-right-sum-differences/
		int nums[] = {10,4,8,3};
		int arr[]=new int[nums.length];
		for (int i=0; i<nums.length;i++)
		{
			int left=leftsum(nums, i);
			int right=rightsum(nums, i);
			int res=Math.abs(left-right);
			arr[i]=res;
		}
		
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
