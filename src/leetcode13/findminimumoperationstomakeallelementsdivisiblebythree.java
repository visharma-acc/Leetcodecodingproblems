package leetcode13;

public class findminimumoperationstomakeallelementsdivisiblebythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[]	nums = {1,2,3,4};
	int count=0;
	for (int i=0;i<nums.length;i++)
	{
		count=count+Math.min(nums[i]%3,(3-nums[i]%3));
	}
    System.out.println(count);
	}

}
