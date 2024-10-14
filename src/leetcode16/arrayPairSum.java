package leetcode16;

public class arrayPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums []= {1,4,3,2};
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]<nums[j])
				{
					nums[i]=nums[i]^nums[j];
					nums[j]=nums[i]^nums[j];
					nums[i]=nums[i]^nums[j];
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<nums.length;i=i+2)
		{
		  sum=sum+Math.min(nums[i], nums[i+1]);	
		}

		System.out.println(sum);
	}

}
