package leetcode12;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {3,1,3,4,2};
		int n=0;
		
		for(int i=0;i<nums.length;i++)
		{
			int index= Math.abs(nums[i])-1;
			if(nums[index]<0)n=Math.abs(nums[i]);
			nums[index]=nums[index]*-1;
		}

		System.out.println(n);
	}

}
