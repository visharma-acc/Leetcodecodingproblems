package leetcode14;

public class maxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max_end_here=nums[0];
		int max_so_far=nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			max_end_here=Math.max(nums[i], nums[i]+max_end_here);
			max_so_far=Math.max(max_so_far, max_end_here);
		}
		
		System.out.println(max_so_far);

	}

}
