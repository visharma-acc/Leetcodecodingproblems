package leetcode5;

public class productExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/product-of-array-except-self/
			
		int nums[] = {0,0};
		int res=nums[0];
		int arr[] =new int[nums.length];
		int prod=1;
		for (int i=0;i<nums.length;i++)
		{
		 prod=prod*nums[i];	
		 //System.out.print(arr[i]);
		 res=res^nums[i];
		}
		
		if(prod==0)
		{
			prod=1;
			for (int i=0;i<nums.length;i++)
			{
				if(nums[i]!=0)
					prod=prod*nums[i];
			}
			for (int i=0;i<nums.length;i++)
			{
				if(nums[i]==0)arr[i]=prod;
				System.out.print(arr[i]);
			}	
			
		}
		else
		{
			for (int i=0;i<nums.length;i++)
			{
				arr[i]=prod/nums[i];
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
