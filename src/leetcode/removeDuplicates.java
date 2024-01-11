package leetcode;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {0,0,1,1,2,3,3,4};
		
		int j=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(i+1<nums.length && nums[i]!=nums[i+1])
			{
				nums[j]=nums[i];
				j++;
			}
			
			if(i==nums.length-1)
			{
				nums[j]=nums[i];
				j++;
			}
			
		}
		
	/*	if(nums[nums.length-2]!=nums[nums.length-1])
		{
			nums[j]=nums[nums.length-1];
			j++;
		} */
		
		System.out.println("j="+j);
		
		for(int i=0;i<j;i++)
		{
			System.out.println(nums[i]);
		}
		
		
	}

}
